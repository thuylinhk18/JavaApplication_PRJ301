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
    private ArrayList<Student> list = new ArrayList<>();

    public StudentList() {
        list.add(new Student(1, "A", "M", "11/11/1999"));
        list.add(new Student(2, "B", "M", "11/11/1999"));
        list.add(new Student(3, "C", "F", "11/11/1999"));
        list.add(new Student(4, "D", "M", "11/11/1999"));
        list.add(new Student(5, "E", "F", "11/11/1999"));
        list.add(new Student(6, "F", "M", "11/11/1999"));
        list.add(new Student(7, "G", "M", "11/11/1999"));
        list.add(new Student(8, "H", "M", "11/11/1999"));
        list.add(new Student(9, "L", "M", "11/11/1999"));
    }

    public ArrayList<Student> getList() {
        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }
    
}
