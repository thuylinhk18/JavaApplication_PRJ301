/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dbcontext.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bebet
 */
public class ProductDAO {

    public List<Product> getProducts() {
        List<Product> products = new ArrayList<>();
        ConnectDB db = ConnectDB.getInstance();
        String query = "SELECT * FROM Products";
        try {
            Connection con = db.openConnection();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String unit = rs.getString(3);
                String category= rs.getString(4);
                double price = rs.getDouble(5);
                products.add(new Product(id, name, unit, category, price));

            }
            con.close();
            statement.close();
            rs.close();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }

    public void addProduct(Product product) {
        String query = "INSERT INTO Products (name,unit,category_id,price) VALUES(?,?,?,?);";
        ConnectDB db = ConnectDB.getInstance();
        Connection con;

        try {
            con = db.openConnection();
            PreparedStatement statement = con.prepareStatement(query);

            statement.setString(1, product.getName());
            statement.setString(2, product.getUnit());
            statement.setString(3, product.getCategory());
            statement.setDouble(4, product.getPrice());

            statement.execute();
            statement.close();
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void removeProduct(int id) {
        String query = "DELETE FROM Products WHERE id = ?;";
        ConnectDB db = ConnectDB.getInstance();
        try {
            Connection con = db.openConnection();
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, id);
            statement.execute();
            con.close();
            statement.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
//

    public void updateProduct(Product product) {
        String query = "UPDATE Products SET name = ?,unit = ?, category = ?,  price=? WHERE id = ?;";
        ConnectDB db = ConnectDB.getInstance();
        try {
            Connection con = db.openConnection();
            PreparedStatement statement = con.prepareStatement(query);

            statement.setString(1, product.getName());
            statement.setString(2, product.getUnit());
            statement.setString(3, product.getCategory());
            statement.setDouble(4, product.getPrice());
            statement.setInt(5, product.getId());

            statement.execute();
            statement.close();
            con.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
   
}
