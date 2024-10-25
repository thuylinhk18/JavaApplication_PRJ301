/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dbcontext;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bebet
 */
public class Test {
    public static void main(String[] args) {
        ConnectDB con = new ConnectDB();
        try {
            System.out.println(con.openConnection());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
