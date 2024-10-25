/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import dbcontext.ConnectDB;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bebet
 */
public class StudentDAO implements StudentDAOInterface {

    public List<Student> getAllStudents() {
        List<Student> sList = new ArrayList<>();

        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet result = null;

        try {
            con = db.openConnection();
            if (con == null) {
                System.err.println("Error: Unable to open database connection");
                return sList;
            }

            String query = "select * from student";
            statement = con.prepareStatement(query);
            result = statement.executeQuery();
            while (result.next()) {
                sList.add(new Student(result.getString(1),
                        result.getString(2),
                        result.getString(3),
                        result.getString(4)));
            }

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                result.close();
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        return sList;
    }

    public void addStudent(Student student) {
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement statement = null;
        try {
            con = db.openConnection();

            if (con == null) {
                System.err.println("Error: Unable to open database connection");
                return;
            }
            String query = "insert into student(id,firstName,lastname,email) values(?,?,?,?);";
            statement = con.prepareStatement(query);
            statement.setString(1, student.getId());
            statement.setString(2, student.getFirstName());
            statement.setString(3, student.getLastName());
            statement.setString(4, student.getEmail());
            statement.execute();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void removeStudent(String id) {
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement statement = null;
        try {
            con = db.openConnection();
            if (con == null) {
                System.err.println("Error: Unable to open database connection");
                return;
            }
            String query = "delete from student where id = ?";
            statement = con.prepareStatement(query);
            statement.setString(1, id);
            statement.execute();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void updateStudent(Student student) {
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement statement = null;
        try {
            con = db.openConnection();
            if (con == null) {
                System.err.println("Error: Unable to open database connection");
                return;
            }
            String query = "UPDATE student SET firstName = ?, lastname= ?, email = ? WHERE id = ?";
            statement = con.prepareStatement(query);
            statement.setString(1, student.getFirstName());
            statement.setString(2, student.getLastName());
            statement.setString(3, student.getEmail());
            statement.setString(4, student.getId());
            statement.execute();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Student searchStudentById(String id) {
        ConnectDB db = ConnectDB.getInstance();
        Connection con = null;
        PreparedStatement statement = null;
        ResultSet result = null;
        Student targetStudent = new Student();
        try {
            con = db.openConnection();
            if (con == null) {
                System.err.println("Error: Unable to open database connection");
                return null;
            }
            String query = "select firstName,lastName,email from student where id=?";
            statement = con.prepareStatement(query);
            statement.setString(1, id);
            result = statement.executeQuery();
            if (result.next()) {
                targetStudent.setId(id);
                targetStudent.setFirstName(result.getString(1));
                targetStudent.setLastName(result.getString(2));
                targetStudent.setEmail(result.getString(3));
            } else {
                System.out.println("No student found with ID: " + id);
                return null;
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                result.close();;
                statement.close();
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(StudentDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return targetStudent;
    }

}
