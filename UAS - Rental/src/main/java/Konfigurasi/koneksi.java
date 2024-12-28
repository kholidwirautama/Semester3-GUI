/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Konfigurasi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Kholid
 */
public class koneksi {
    public static Connection getConnection(){
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/gudangku";
        String user = "root";
        String password = "";
        try {
            conn = DriverManager.getConnection(url, user, password);
        }   catch (SQLException e) {
            System.out.println(e);
        }
        return conn;
    }
    
    public static void main(String[] args) {
        try {
            Connection c = koneksi.getConnection();
            System.out.println(String.format("Conncted to database %s " + "Successfully.", c.getCatalog()));
        }   catch (SQLException e) {
            System.out.println(e);
        }
    }
    
}
