/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Real_Estate;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

//import com.mysql.jdbc.ResultSetMetaData;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Vector;
/**
 *
 * @author sangramjithazarika
 */
public class DB {

    Connection con = null;
    java.sql.PreparedStatement pst;
    public static Connection dbconnect()
    {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/real_estate","root","");
            return conn;
        } catch (Exception e2) {
            System.out.println(e2+"Not connected ");
            return null;
        }
    }
    
}
