package controller;

import dal.CategoryDAL;
import dal.ProductDAL;
import model.Category;
import model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/editProduct")
public class EditProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("id"));
        ProductDAL productDAL = new ProductDAL();
        CategoryDAL categoryDAL = new CategoryDAL();
        try {
            // Lấy sản phẩm cần chỉnh sửa
            Product product = productDAL.getProductById(productId);
            request.setAttribute("product", product);

            // Lấy danh sách các danh mục để hiển thị trong dropdown
            List<Category> categories = categoryDAL.getAllCategories();
            request.setAttribute("categories", categories);

            // Forward tới trang editProduct.jsp để hiển thị thông tin sản phẩm
            request.getRequestDispatcher("/editProduct.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Lấy thông tin từ form
        int productId = Integer.parseInt(request.getParameter("productId"));
        String productName = request.getParameter("productName");
        String unit = request.getParameter("unit");
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        double price = Double.parseDouble(request.getParameter("price"));

        // Tạo đối tượng Product với dữ liệu đã được chỉnh sửa
        Product product = new Product(productId, productName, unit, categoryId, price);
        ProductDAL productDAL = new ProductDAL();

        try {
            // Cập nhật sản phẩm trong cơ sở dữ liệu
            productDAL.updateProduct(product);
            // Sau khi cập nhật, chuyển hướng về trang danh sách sản phẩm
            response.sendRedirect("productList");
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
