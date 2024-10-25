/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import model.Student;

/**
 *
 * @author bebet
 */
public class Test {

    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        System.out.println(dao.getAllStudents());
//        Student student = new Student("0", "hi", "ho", "hihihoho");
//        dao.addStudent(student);
//        dao.removeStudent("0");

        System.out.println(dao.searchStudentsByAnyInfo("", "Linh", "", ""));
    }
}
