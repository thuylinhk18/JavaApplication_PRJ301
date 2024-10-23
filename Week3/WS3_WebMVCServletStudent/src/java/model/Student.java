/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bebet
 */
public class Student {

    private int id;
    private String name;
    private boolean gender;
    private Date dob;

    public Student() {
    }

    public Student(int id, String name, boolean gender, Date dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.dob = dob;
    }

    public Student(Student s) {
        this(s.id, s.name, s.gender, s.dob);
    }

    public Student(int id, String name, String gender, String dob) {
        this.id = id;
        this.name = name;
        this.gender = gender.equals("M");
        setDob(dob);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public String getGender() {
        return gender ? "Male" : "Female";
    }

    public void setGender(String gender) {
        this.gender = gender.equals("M");
    }

    public String getDob() {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        return myFormat.format(dob);
    }

    public void setDob(String dob) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            this.dob = new Date(myFormat.parse(dob).getTime());
        } catch (ParseException ex) {
            Logger.getLogger(Student.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", gender=" + gender + ", dob=" + dob + '}';
    }

}
