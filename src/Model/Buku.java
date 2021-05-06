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
public class Buku {
    private String kodeBuku;
    private String namaBuku;
    private String statusBuku;
    private String query;
    private ResultSet rs;
    private Statement stmt;
    private ResultSet rs_c;
    private Statement stmt_c;
    private int jumBaris;
    
    public String [][] getBuku(){
        Koneksi kon = new Koneksi();
        Connection connect = kon.koneksiDatabase();
        String data[][] = null;
        try{
            stmt = connect.createStatement();
            query = "SELECT b.kode_buku, b.nama_buku, "
                    + "k.nama_kategori_buku, b.status_buku "
                    + "from buku b inner join kategori_buku k "
                    + "on b.kode_kategori_buku = k.kode_kategori_buku "
                    + "order by b.kode_buku, b.nama_buku";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000][jmlKolom];
            int r = 0;
            while(rs.next()){
                for(int c=0; c<jmlKolom; c++){
                    data[r][c] = rs.getString(c+1);
                }
                r++;
            }
            int jmlBaris = r;
            String [][] tmparray = data;
            data = new String[jmlBaris][jmlKolom];
            for(r=0; r<jmlBaris; r++){
                for(int c=0; c<jmlKolom; c++){
                    data[r][c]=tmparray[r][c];
                }
            }
            stmt.close();
            connect.close();
        }   
        catch(SQLException ex){
            System.out.println("Error : "+ex.getMessage());
        }
        return data;
    }
    
    public int TambahBuku(String KodeKategori, String KodeBuku, String NamaBuku){
        jumBaris = 0;
        String StatusBuku = "Tersedia";
        Koneksi kon = new Koneksi();
        Connection connect = kon.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "insert into buku ('kode_buku', "
                    + "'kode_kategori_buku', 'nama_buku' ,'status_buku') "
                    + " values ('"+KodeBuku+"','"+KodeKategori+"','"+NamaBuku
                    +"','"+StatusBuku+"') ";
            stmt.executeQuery(query);
            stmt_c = connect.createStatement();
            rs_c = stmt_c.executeQuery("SELECT COUNT(*) FROM 'kategori_buku'");
            while(rs_c.next()){
                jumBaris = rs_c.getInt(1);
            }
            stmt.close();
            stmt_c.close();
            connect.close();
        }   
        catch(SQLException ex){
            System.out.println("Error : "+ex.getMessage());
        }
        return jumBaris;
    }
    
    public String [][] getDataBuku(String KodeBuku){
        Koneksi kon = new Koneksi();
        Connection connect = kon.koneksiDatabase();
        String data[][] = null;
        try{
            stmt = connect.createStatement();
            query = "Select 'k'.'kode_kategori_buku', 'k'.'nama_kategori_buku', "
                    + "'b'.'nama_buku' "
                    + "from 'buku' 'b' inner join 'kategori_buku' 'k' "
                    + "on 'b'.'kode_kategori_buku' = 'k'.'kode_kategori_buku' "
                    + "where 'b'.'kode_buku' = '"+KodeBuku+"' ";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000][jmlKolom];
            int r = 0;
            while(rs.next()){
                for(int c=0; c<jmlKolom; c++){
                    data[r][c] = rs.getString(c+1);
                }
                r++;
            }
            int jmlBaris = r;
            String [][] tmparray = data;
            data = new String[jmlBaris][jmlKolom];
            for(r=0; r<jmlBaris; r++){
                for(int c=0; c<jmlKolom; c++){
                    data[r][c]=tmparray[r][c];
                }
            }
            stmt.close();
            connect.close();
        }   
        catch(SQLException ex){
            System.out.println("Error : "+ex.getMessage());
        }
        return data;
    }
    
    public void editBuku(String KategoriBuku, String KodeBuku, String NamaBuku,
                        String KodeKategori){
        Koneksi kon = new Koneksi();
        Connection connect = kon.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "update buku set 'kode_kategori_buku' = '"+KodeKategori+"',"
                    + " 'nama_buku' = '"+NamaBuku+"'"
                    + "where kode_buku = '"+KodeBuku+"'";
            stmt.executeQuery(query);
            
            stmt.close();
            connect.close();
        }   
        catch(SQLException ex){
            System.out.println("Error : "+ex.getMessage());
        }
    }
    
    public void HapusDataKategori(String KodeBuku){
        Koneksi kon = new Koneksi();
        Connection connect = kon.koneksiDatabase();
        try{
            stmt = connect.createStatement();
            query = "DELETE FROM buku WHERE kode_buku='"+KodeBuku+"'";
            stmt.executeQuery(query);
            
            stmt.close();
            connect.close();
        }   
        catch(SQLException ex){
            System.out.println("Error : "+ex.getMessage());
        }
    }
    
    public String [][] CariBuku(String kataKunci){
        Koneksi kon = new Koneksi();
        Connection connect = kon.koneksiDatabase();
        String data[][] = null;
        try{
            stmt = connect.createStatement();
            query = "select 'k'.'nama_kategori_buku', 'b'.'kode_buku', "
                    + "'b'.'nama_buku', 'b'.'status_buku' "
                    + "from 'buku' 'b' inner join 'kategori_buku' 'k' "
                    + "on 'b'.'kode_kategori_buku' = 'k'.'kode_kategori_buku' "
                    + "where 'b'.'nama_buku' LIKE '%"+kataKunci+"%' "
                    + "order by 'b'.'kode_buku', 'b'.'nama_buku'";
            rs = stmt.executeQuery(query);
            ResultSetMetaData meta = rs.getMetaData();
            int jmlKolom = meta.getColumnCount();
            data = new String[1000][jmlKolom];
            int r = 0;
            while(rs.next()){
                for(int c=0; c<jmlKolom; c++){
                    data[r][c] = rs.getString(c+1);
                }
                r++;
            }
            int jmlBaris = r;
            String [][] tmparray = data;
            data = new String[jmlBaris][jmlKolom];
            for(r=0; r<jmlBaris; r++){
                for(int c=0; c<jmlKolom; c++){
                    data[r][c]=tmparray[r][c];
                }
            }
            stmt.close();
            connect.close();
        }   
        catch(SQLException ex){
            System.out.println("Error : "+ex.getMessage());
        }
        return data;
    }
}
