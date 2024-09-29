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

    ArrayList<Student> sList = new ArrayList<>();

    public StudentList() {
        sList.add(new Student(1, "Thùy Linh", "IT"));
        sList.add(new Student(2, "Trần Thị B", "IT"));
        sList.add(new Student(3, "Lê Văn C", "GD"));
        sList.add(new Student(4, "Kien Tran", "IT"));
    }

    public ArrayList<Student> getsList() {
        return sList;
    }

    public void setsList(ArrayList<Student> sList) {
        this.sList = sList;
    }

}
