package dal;

import model.Category;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryDAL {
    private Connection connection;

    public CategoryDAL() {
        connection = new DBContext().getConnection(); // Sử dụng DBContext để lấy kết nối
    }

    public List<Category> getAllCategories() throws SQLException {
        List<Category> categories = new ArrayList<>();
        String query = "SELECT * FROM category";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                categories.add(new Category(
                        rs.getInt("category_id"),
                        rs.getString("category_name"),
                        rs.getString("description")
                ));
            }
        }
        return categories;
    }

    public void addCategory(Category category) throws SQLException {
        String query = "INSERT INTO category (category_name, description) VALUES (?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, category.getCategoryName());
            ps.setString(2, category.getDescription());
            ps.executeUpdate();
        }
    }
}
