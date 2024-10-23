package controller;

import dal.CategoryDAL;
import model.Category;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/addCategory")
public class AddCategoryServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Forward tới trang thêm Category
        request.getRequestDispatcher("/addCategory.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Nhận dữ liệu từ form
        String categoryName = request.getParameter("categoryName");
        String description = request.getParameter("description");

        // Tạo đối tượng Category
        Category category = new Category(0, categoryName, description);
        CategoryDAL categoryDAL = new CategoryDAL();  // Sử dụng DAL với DBContext

        try {
            // Thêm Category vào cơ sở dữ liệu
            categoryDAL.addCategory(category);
            response.sendRedirect("categoryList");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
