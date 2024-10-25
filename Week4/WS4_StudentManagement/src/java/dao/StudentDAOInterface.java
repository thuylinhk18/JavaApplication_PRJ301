/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author bebet
 */
public interface StudentDAOInterface {

    List<Student> getAllStudents();

    void removeStudent(String id);

    void addStudent(Student student);
}
