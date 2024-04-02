/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hightable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.table.DefaultTableModel;
import jdbc.JDBC;

/**
 *
 * @author Rhodz
 */
public class underthetable {
    private Connection connection;
    private JDBC jdbc;
    private PreparedStatement ps;
    private String sql;
    private ResultSet rs;
    private ResultSetMetaData rm;
    
    public underthetable() {
        this.jdbc = new JDBC();
        this.connection = new JDBC().getConnection();
    }
    
    public void populateTable(DefaultTableModel model) {
        try {
            model.setRowCount(0);
            sql = "SELECT * FROM info";
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
