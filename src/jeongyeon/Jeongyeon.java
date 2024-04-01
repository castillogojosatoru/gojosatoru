/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jeongyeon;

import java.sql.Connection;
import jdbc.JDBC;
import mina.addStudent;

/**
 *
 * @author Jihyo
 */
public class Jeongyeon {

    public static void JDBCconnect() {
        JDBC nayeon = new JDBC();
        
        try {
            Connection jihyo = nayeon.getConnection();
            if (jihyo != null) {
                System.out.println("Connected to TWICETAGRAM.");
            }
            else {
                System.out.println("Failed to connect to TWICETAGRAM.");
            }
        } catch (Exception e) {
        }
    }
    public static void main(String[] args) {
        JDBCconnect();
        
        addStudent addstudent = new addStudent();
        addstudent.setVisible(true);
    }
    
}
