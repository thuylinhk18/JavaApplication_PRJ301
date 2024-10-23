package controller;

import dal.ProductDAL;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/removeProduct")
public class RemoveProductServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int productId = Integer.parseInt(request.getParameter("id"));
        ProductDAL productDAL = new ProductDAL();
        try {
            // Xóa sản phẩm khỏi cơ sở dữ liệu
            productDAL.deleteProduct(productId);
            // Chuyển hướng về trang danh sách sản phẩm sau khi xóa thành công
            response.sendRedirect("productList");
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
