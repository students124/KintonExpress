/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import com.interfaceable.Authenticable;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iolux
 */
public class Barang {
    public ArrayList<DataBarang> getAll() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
            
        ArrayList<Barang.DataBarang> result = new ArrayList<Barang.DataBarang>();
            
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kintonexpress", "root", "");
        Statement stmt = connect.createStatement();
            
        ResultSet rs = stmt.executeQuery("SELECT * FROM barang");
        
        while(rs.next()){
            result.add(new Barang.DataBarang(rs.getString("nama_barang"), rs.getString("tipe_barang"), rs.getInt("berat_barang"), rs.getInt("kuantitas_barang"), rs.getDouble("harga_barang")));
        }
        
        return result;
    }
    
    public DataBarang getBarangByName(String nama) throws ClassNotFoundException, SQLException{
         Class.forName("com.mysql.jdbc.Driver");
            
        DataBarang result = null;

        String query = "SELECT * FROM barang WHERE nama_barang = ?";

        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kintonexpress", "root", "");
        PreparedStatement prepStmt = connect.prepareStatement(query);
        prepStmt.setString(1, nama);

        ResultSet rs = prepStmt.executeQuery();
            
        while(rs.next()){
            result = new Barang.DataBarang(rs.getString("nama_barang"), rs.getString("tipe_barang"), rs.getInt("berat_barang"), rs.getInt("kuantitas_barang"), rs.getDouble("harga_barang"));
        }
        
        return result;
    }
    
    public class DataBarang{
        private String nama,tipe;
        private int berat,kuantitas;
        private double harga;
        
        public DataBarang(String nama, String tipe, int berat, int kuantitas, double harga){
            this.nama = nama;
            this.tipe = tipe;
            this.berat = berat;
            this.kuantitas = kuantitas;
            this.harga = harga;
        }
        
        public String getNama(){
            return this.nama;
        }
        
        public String getTipe(){
            return this.tipe;
        }
        
        public int getBerat(){
            return this.berat;
        }
        
        public int getKuantitas(){
            return this.kuantitas;
        }
        
        public double getHarga(){
            return this.harga;
        }
    }
}
