package dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBContext {
    private static final String URL = "jdbc:sqlserver://localhost:1433;databaseName=PT2";
    private static final String USER = "sa";
    private static final String PASSWORD = "123";
    public Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DBContext.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     public static void main(String[] args) {
        System.out.println(new DBContext().getConnection());
    }
}
