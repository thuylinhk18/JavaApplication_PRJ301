/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author bebet
 */
public class UserService {

    // day la cach khac cua init param?
    public boolean checkLogin(User user) {
        if (user.getUsername().equals("admin") && user.getPassword().equals("123456")) {
            return true;
        }
        return false;
    }
}
