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
public class User {
    private String query;
    private ResultSet rs;
    private Statement stmt;
    public static int IDUser;
    
    public static void setIDUser(int id_user){
        User.IDUser = id_user;
    }
    
    public static int getIDUser(){
        return IDUser;
    }
    
    public int CekUser(String username, String password){
    Koneksi kon = new Koneksi();
    Connection connect = kon.koneksiDatabase();
    int data= 0;
        try {
            stmt = connect.createStatement();
            query = "SELECT COUNT(id_user) from user where username='"+username+"'"
                    +"and password='"+password+"' ";
            rs = stmt.executeQuery(query);
            while(rs.next()){
                data = rs.getInt(1);
            }
            stmt.close();
            connect.close();
        } catch (SQLException ex) {
            System.out.println("Error : "+ex.getMessage());
        }
    
    
    return data;
    }
    public int GetIdUser(String username, String password){
    Koneksi kon = new Koneksi();
    Connection connect = kon.koneksiDatabase();
    int data= 0;
        try {
            stmt = connect.createStatement();
            query = "SELECT id_user from user where username='"+username+"'"
                    +"and password='"+password+"' ";
            rs = stmt.executeQuery(query);
            while(rs.next()){
                data = rs.getInt(1);
            }
            stmt.close();
            connect.close();
        } catch (SQLException ex) {
            System.out.println("Error : "+ex.getMessage());
        }
    
    
    return data;
    }
    
    public String [][] getProfil(int id_user){
    Koneksi kon = new Koneksi();
    Connection connect = kon.koneksiDatabase();
    String data [][] = null;
        try {
            stmt = connect.createStatement();
            query = "SELECT nama, jenis_kelamin,email from user "
                    +"where id_user = "+id_user;
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000][jmlKolom];
            int r = 0;
            while (rs.next()) {
                for (int c = 0; c < jmlKolom; c++) {
                    data[r][c] = rs.getString(c+1);
                }
                r++;
            }
            int jmlBaris = r;
            String [][] tmparray = data;
            for (r = 0; r < jmlBaris; r++) {
                for (int c = 0; c < jmlKolom; c++) {
                    data[r][c] = tmparray[r][c];
                }
            }
            stmt.close();
            connect.close();
        } catch (Exception ex) {
            System.out.println("Error : "+ex.getMessage());
        }
    
    
    
    return data;
    }
    
    
}
