/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
import java.sql.*;
/**
 *
 * @author Lapankha
 */
public class Koneksi {
    public Connection koneksi = null;
    public Connection koneksiDatabase() {
        try{
            //setting driver mysql
            Class.forName("com.mysql.jdbc.Driver");
            //buat connection 
            koneksi = DriverManager.getConnection("jdbc:mysql:///persewaan_buku","root","");    
        }catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection Error : " + e.getMessage());
        }
        return koneksi;
}
}
