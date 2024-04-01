/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc;

import java.util.logging.Logger;
import java.util.logging.Level;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class JDBC {
    public Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/jihyo",
                    "Jihyo", "itsmerhodeca8890");
        } catch (ClassNotFoundException |SQLException e) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, e);
        }
        return null;
    }
    
    public void closeConnection(Connection connection) {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
                
        } catch (Exception e) {
            Logger.getLogger(JDBC.class.getName()).log(Level.SEVERE, null, e);
        }
    }
}
