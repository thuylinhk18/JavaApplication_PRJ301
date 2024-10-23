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
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bebet
 */
public class AdminDAO {

    public List<Admin> getAllAdmins() {
        List<Admin> adminList = new ArrayList<>();

        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            con = db.openConnection();
            if (con == null) {
                System.err.println("Error: Unable to open database connection.");
                return adminList;
            }
            String sql = "Select * from  Admin";
            statement = con.prepareStatement(sql);
            result = statement.executeQuery();
            while (result.next()) {
                String userName = result.getString(1);
                String password = result.getString(2);
                int role = result.getInt(3);
                adminList.add(new Admin(userName, password, role));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                result.close();
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return adminList;
    }

    public Admin checkAccount(String userNameToCheck, String passwordToCheck) {

        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        try {
            con = db.openConnection();
            if (con == null) {
                System.err.println("Error: Unable to open database connection.");
                return null;
            }
            String sql = "select userName,password,role from Admin \n"
                    + "where userName = ? and password = ?";
            statement = con.prepareStatement(sql);
            statement.setString(1, userNameToCheck);
            statement.setString(2, passwordToCheck);
            result = statement.executeQuery();
            if (result.next()) {
                Admin admin = new Admin(result.getString("userName"),
                        result.getString("password"),
                        result.getInt("role"));

                return admin;

            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                result.close();
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(AdminDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return null;
    }
}
