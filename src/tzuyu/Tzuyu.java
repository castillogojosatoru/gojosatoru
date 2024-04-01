/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tzuyu;

import jdbc.JDBC;
import java.sql.Connection;
import java.sql.PreparedStatement;
import jihyo.Jihyo;
import java.util.logging.Logger;
import java.util.logging.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JComboBox;

public class Tzuyu {
    
    private Connection connection;
    private JDBC jdbc;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rm;
    
    public Tzuyu() {
        this.jdbc = new JDBC();
        this.connection = new JDBC().getConnection();
    }
    
    public void addStudent(Jihyo _zyozyo) {
        try {
            sql = "INSERT into enrollment (fullname, age, gender, birthdate, course) values(?, ?, ?, ?, ?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, _zyozyo.getName());
            ps.setInt(2, _zyozyo.getAge());
            ps.setString(3, _zyozyo.getGender());
            ps.setString(4, _zyozyo.getBirthdate());
            ps.setString(5, _zyozyo.getCourse());
            
            
            int result = ps.executeUpdate();
            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Student successfully added.");
            }
            else {
                JOptionPane.showMessageDialog(null, "Student failed to added.");
            }
        } catch (Exception e) {
            Logger.getLogger(Tzuyu.class.getName()).log(Level.SEVERE, null, e);
        }
    }
    
    public void populateTable(DefaultTableModel model) {
        try {
            model.setRowCount(0);
            sql = "SELECT * FROM enrollment";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            rm = rs.getMetaData();
            int columnCount = rm.getColumnCount();
            while(rs.next()) {
                Object[] row = new Object[columnCount];
                for(int i = 1; i < columnCount; i++) {
                    row[i - 1] = rs.getObject(i);
                }
                model.addRow(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
