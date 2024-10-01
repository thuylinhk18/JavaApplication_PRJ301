package test;


import dao.StudentDAO;
import java.util.List;
import model.Student;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bebet
 */
public class Test {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        List<Student> sList  = dao.getStudentList();
        System.out.println(sList);
        
    }
}
