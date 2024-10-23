package controller;

import dal.ProductDAL;
import model.Product;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/productList")
public class ProductListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductDAL productDAL = new ProductDAL();
        try {
            // Lấy danh sách sản phẩm từ cơ sở dữ liệu
            List<Product> products = productDAL.getAllProducts();
            request.setAttribute("products", products);
            // Forward tới trang JSP để hiển thị danh sách sản phẩm
            request.getRequestDispatcher("/productList.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
