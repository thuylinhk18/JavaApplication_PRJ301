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
public class UserList {

    ArrayList<User> userList = new ArrayList<>();

    public UserList() {
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public void insertUser(User user) {
        userList.add(user);
    }

    @Override
    public String toString() {
        return userList.toString();
    }

}
