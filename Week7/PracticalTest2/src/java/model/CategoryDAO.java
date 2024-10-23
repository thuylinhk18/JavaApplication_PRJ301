/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dbcontext.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bebet
 */
public class CategoryDAO {
    public List<Category> getCategories() {
        List<Category> categories = new ArrayList<>();
        ConnectDB db = ConnectDB.getInstance();
        String sql = "SELECT * FROM Categories";
        try {
            Connection con = db.openConnection();
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            while (rs.next()) {
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String description = rs.getString(3);
                categories.add(new Category(id, name, description));

            }
            con.close();
            statement.close();
            rs.close();
        } catch (Exception ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }

    public void addCategory(Category category) {
        String sql = "INSERT INTO Categories(name,description) VALUES(?,?);";
        ConnectDB db = ConnectDB.getInstance();
        Connection con;

        try {
            con = db.openConnection();
            PreparedStatement statement = con.prepareStatement(sql);

            statement.setString(1, category.getName());
            statement.setString(2, category.getDescription());

            statement.execute();
            statement.close();
            con.close();
        } catch (Exception ex) {
            Logger.getLogger(CategoryDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
