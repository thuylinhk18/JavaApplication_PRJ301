package dal;

import model.Product;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDAL {
    private Connection connection;

    public ProductDAL() {
        connection = new DBContext().getConnection(); // Sử dụng DBContext để lấy kết nối
    }

    public List<Product> getAllProducts() throws SQLException {
        List<Product> products = new ArrayList<>();
        String query = "SELECT * FROM product";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                products.add(new Product(
                        rs.getInt("product_id"),
                        rs.getString("product_name"),
                        rs.getString("unit"),
                        rs.getInt("category_id"),
                        rs.getDouble("price")
                ));
            }
        }
        return products;
    }

    public void addProduct(Product product) throws SQLException {
        String query = "INSERT INTO product (product_name, unit, category_id, price) VALUES (?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, product.getProductName());
            ps.setString(2, product.getUnit());
            ps.setInt(3, product.getCategoryId());
            ps.setDouble(4, product.getPrice());
            ps.executeUpdate();
        }
    }
    
        public Product getProductById(int productId) throws SQLException {
        String query = "SELECT * FROM product WHERE product_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, productId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Product(
                    rs.getInt("product_id"),
                    rs.getString("product_name"),
                    rs.getString("unit"),
                    rs.getInt("category_id"),
                    rs.getDouble("price")
                );
            }
            return null;
        }
    }

    // Cập nhật sản phẩm
    public void updateProduct(Product product) throws SQLException {
        String query = "UPDATE product SET product_name = ?, unit = ?, category_id = ?, price = ? WHERE product_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setString(1, product.getProductName());
            ps.setString(2, product.getUnit());
            ps.setInt(3, product.getCategoryId());
            ps.setDouble(4, product.getPrice());
            ps.setInt(5, product.getProductId());
            ps.executeUpdate();
        }
    }
    
        // Phương thức xóa sản phẩm theo productId
    public void deleteProduct(int productId) throws SQLException {
        String query = "DELETE FROM product WHERE product_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1, productId);
            ps.executeUpdate();
        }
    }
}
