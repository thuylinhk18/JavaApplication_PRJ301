/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test;

import dao.StudentDAO;

/**
 *
 * @author bebet
 */
public class main {
    public static void main(String[] args) {
        StudentDAO studentDAO = new StudentDAO();
        System.out.println("" + studentDAO.getStudents());
    }
}
