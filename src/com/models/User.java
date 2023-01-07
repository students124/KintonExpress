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
import java.io.Serializable;
import com.interfaceable.Authenticable;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iolux
 */
public class User implements Authenticable, Serializable{
    public ArrayList<User.DataUser> getAll() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
            
        ArrayList<User.DataUser> result = new ArrayList<User.DataUser>();
            
        Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kintonexpress", "root", "");
        Statement stmt = connect.createStatement();
            
        ResultSet rs = stmt.executeQuery("SELECT * FROM user");
        
        while(rs.next()){
            result.add(new User.DataUser(rs.getString("nama"),rs.getString("userId"),rs.getInt("userType")));
        }
        
        return result;
    }
    
    public User.DataUser login(String id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            User.DataUser result = null;
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kintonexpress", "root", "");
            Statement stmt = connect.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE userId = '" + id  + "'");
            
            while(rs.next()){
                result = new User.DataUser(rs.getString("nama"), rs.getString("userId"), rs.getInt("userType"));
            }
            
            return result;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean register(String id, String nama,String no_telp ,int gender, int userType)throws SQLException{
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            String query = "INSERT INTO user(userId,nama,gender,userType,no_telp) VALUES(?,?,?,?,?)";
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kintonexpress", "root", "");
            PreparedStatement prepStmt = connect.prepareStatement(query);
//            prepStmt.setInt(1, Integer.parseInt(nilai));
            prepStmt.setString(1, id);
            prepStmt.setString(2, nama);
            prepStmt.setInt(3, gender);
            prepStmt.setInt(4, userType);
            prepStmt.setString(5, no_telp);
            
            prepStmt.executeUpdate();
            
            connect.close();
            
            return true;
        } catch (ClassNotFoundException E){
            System.out.println(E);
        }
        
        return false;
    }

    @Override
    public void logout() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void profile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void registration() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void twoStepVerification() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public DataUser login() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public class DataUser implements Serializable{
        private String nama,id;
        private int typeUser;
        
        public DataUser(String nama, String id, int typeUser){
            this.nama = nama;
            this.id = id;
            this.typeUser = typeUser;
        }
        
        
        public String getId(){
            return this.id;
        }
        
        public int getTypeUser(){
            return this.typeUser;
        }
        
        public String getNama(){
            return this.nama;
        }
        
    }
    
    
}
