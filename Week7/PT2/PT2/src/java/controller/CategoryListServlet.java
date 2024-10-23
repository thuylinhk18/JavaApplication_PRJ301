package controller;

import dal.CategoryDAL;
import model.Category;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet("/categoryList")
public class CategoryListServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Sử dụng CategoryDAL với DBContext đã được thiết lập
        CategoryDAL categoryDAL = new CategoryDAL();  // DBContext được sử dụng trong DAL
        try {
            // Lấy danh sách Category từ cơ sở dữ liệu
            List<Category> categories = categoryDAL.getAllCategories();
            request.setAttribute("categories", categories);
            // Forward tới trang JSP để hiển thị danh sách Category
            request.getRequestDispatcher("/categoryList.jsp").forward(request, response);
        } catch (SQLException e) {
            throw new ServletException(e);
        }
    }
}
