/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author bebet
 */
public class StudentList {

    private ArrayList<Student> studentList = new ArrayList<>();

    public StudentList() {
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    

    public ArrayList<Student> removeByID(int id) {
        for (Student student : studentList) {
            if (student.getId() == id) {
                studentList.remove(student);
            }
        }
        return studentList;
    }

    public ArrayList<Student> update(Student studentToUpdate) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentToUpdate.getId() == studentList.get(i).getId()) {
                studentList.set(i, studentToUpdate);
            }
        }
        return studentList;
    }
    // id thi duy nhat nhung day la cho phep nhap 1 phan 

    public ArrayList<Student> searchByID(int idToSearch) {
        ArrayList<Student> resultList = new ArrayList<>();
        String id = String.valueOf(idToSearch);
        for (Student student : studentList) {
            if (String.valueOf(student.getId()).contains(id)) {
                resultList.add(student);
            }
        }
        return resultList;
    }

    public ArrayList<Student> searchByName(String name) {
        ArrayList<Student> resultList = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getName().contains(name)) {
                resultList.add(student);
            }
        }
        return resultList;
    }
    
}
