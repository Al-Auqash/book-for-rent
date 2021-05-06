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
public class KategoriBuku {
    String kodeKategoriBuku,namaKategoriBuku;
    private String query;
    private ResultSet rs;
    private Statement stmt;
    private ResultSet rs_c;
    private Statement stmt_c;    
    private static int IDUser;
    private int jumBaris;
    
    public String [][] getKategoriBuku(){
    Koneksi kon = new Koneksi();
    Connection connect = kon.koneksiDatabase();
    String data[][] = null;
    
        try {
            stmt = connect.createStatement();
            
            query = "Select kode_kategori_buku,nama_kategori_buku from kategori_buku"
                    + " order by nama_kategori_buku";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            int r = 0;
            data = new String[1000][jmlKolom];
            while (rs.next()) {
                for (int c = 0; c < jmlKolom; c++) {
                    data[r][c] = rs.getString(c+1);
                }
                r++;
            }
            int jmlBaris = r;
            String [][] tmparray = data;
            data = new String[jmlBaris][jmlKolom];
            for (r = 0; r < jmlBaris; r++) {
                for (int c = 0; c < jmlKolom; c++) {
                    data[r][c] = tmparray[r][c];
                }
                
            }
            stmt.close();
            connect.close();
        } catch (SQLException ex) {
            System.out.println("Error : "+ex.getMessage());
        }
    
    return data;
    }
    
    public String [][] CariDataKategori(String kategori){
    
    Koneksi kon = new Koneksi();
    Connection connect = kon.koneksiDatabase();
    String data [][] = null;
        try {
            stmt = connect.createStatement();
            query = "SELECT kode_kategori_buku,nama_kategori_buku from kategori_buku "
                    +"where nama_kategori_buku "
                    + "like '%"+kategori+"%' order by nama_kategori_buku";
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
            data = new String [jmlBaris][jmlKolom];
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
    public String getDataKategori(String kode){
    Koneksi kon = new Koneksi();
    Connection connect = kon.koneksiDatabase();
    String data = null;
    
        try {
            stmt = connect.createStatement();
            
            query = "Select nama_kategori from kategory_buku"
                    + "where kode_kategori_buku = '"+kode+"'";
            rs = stmt.executeQuery(query);
            while (rs.next()) {   
                data = rs.getString(1);
            }
            rs.close();;
            stmt.close();
            connect.close();
        } catch (SQLException ex) {
            System.out.println("Error : "+ex.getMessage());
        }
    
    return data;
    }
    public String [] getListKategori(){
    String data [] = null;
    Koneksi kon = new Koneksi();
    Connection connect = kon.koneksiDatabase();

        try {
            stmt = connect.createStatement();
            query = "SELECT kode_kategori_buku,nama_kategori_buku from kategori_buku "                    
                    + "order by kode_kategori_buku";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000];
            int r = 0;
            while (rs.next()) {
               String id = rs.getString(1);
               String nama = rs.getString(2);
               String list = id+"-"+nama;
               data[r] = list;
                r++;
            }
            int jmlBaris = r;
            String [] tmparray = data;
            data = new String[jmlBaris];
            for (r = 0; r < jmlBaris; r++) {
                data[r] = tmparray[r];
            }
            stmt.close();
            connect.close();
        } catch (Exception ex) {
            System.out.println("Error : "+ex.getMessage());
        }
    
        
    return data;
    }
    public int TambahDataKategori(String kode,String kategori){
       jumBaris = 0;
       Koneksi kon = new Koneksi();
       Connection connect = kon.koneksiDatabase();
       try{
           stmt = connect.createStatement();
           query = "insert into kategori_buku "
                   + "(`kode_kategori_buku`, `nama_kategori_buku`) "
                   + " values ('"+kode+"','"+kategori+"') ";
           stmt.executeUpdate(query);
           stmt_c = connect.createStatement();
           rs_c = stmt_c.executeQuery("SELECT COUNT(*) FROM `kategori_buku`");
           while (rs_c.next()){
              jumBaris = rs_c.getInt(1);
           }        
           stmt.close();
           stmt_c.close();
           connect.close();
       }catch(SQLException ex){
           System.out.println("Error : " + ex.getMessage());
       }
       return jumBaris;
    }
    public void UpdateDataKategori(String kode,String kategori){
       Koneksi kon = new Koneksi();
       Connection connect = kon.koneksiDatabase();
       try{
           stmt = connect.createStatement();
           query = "update `mobil` set `nama_kategori_buku`='"+kategori+"'"
                   + " where `kode_kategori_buku` ='"+kode+"' ";
           stmt.executeUpdate(query);
           
           stmt.close();
           connect.close();
       }catch(SQLException ex){
           System.out.println("Error : " + ex.getMessage());
       } 
    }
    
        public void HapusDataKategori(String kode){
        Koneksi kon = new Koneksi();
        Connection connect = kon.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "DELETE FROM kategori_buku WHERE kode_kategori_buku='"+kode+"'";
            stmt.executeUpdate(query);
            
            stmt.close();
            connect.close();
        }   
        catch(SQLException ex){
            System.out.println("Error : "+ex.getMessage());
        }
    }
    
}
