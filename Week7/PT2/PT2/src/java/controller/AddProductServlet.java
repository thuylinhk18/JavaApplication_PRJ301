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

@WebServlet("/addProduct")
public class AddProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CategoryDAL categoryDAL = new CategoryDAL();
        try {
            // Lấy danh sách category để hiển thị trong dropdown
            List<Category> categories = categoryDAL.getAllCategories();
            request.setAttribute("categories", categories);
            // Forward tới trang thêm sản phẩm
            request.getRequestDispatcher("/addProduct.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Nhận dữ liệu từ form
        String productName = request.getParameter("productName");
        String unit = request.getParameter("unit");
        int categoryId = Integer.parseInt(request.getParameter("categoryId"));
        double price = Double.parseDouble(request.getParameter("price"));

        // Tạo đối tượng Product
        Product product = new Product(0, productName, unit, categoryId, price);
        ProductDAL productDAL = new ProductDAL();  // Sử dụng ProductDAL với DBContext

        try {
            // Thêm Product vào cơ sở dữ liệu
            productDAL.addProduct(product);
            response.sendRedirect("productList");  // Chuyển hướng sau khi thêm
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
