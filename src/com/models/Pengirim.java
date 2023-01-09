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
import com.interfaceable.*;
import com.helper.SessionHelper;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iolux
 */
public class Pengirim extends User implements Memberable, Serializable{
    private boolean memberStatus = false;

    @Override
    public DataUser login(String id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            DataUser result = null;
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kintonexpress", "root", "");
            Statement stmt = connect.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM pengirim WHERE userId = '" + id  + "'");
            
            while(rs.next()){
                result = new DataUser(rs.getString("nama"), rs.getString("userId"));
            }
            
            return result;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean register(String id, String nama, String no_telp, String gender) {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            String query = "INSERT INTO pengirim(userId, nama,no_telp,gender) VALUES(?,?,?,?)";
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kintonexpress", "root", "");
            PreparedStatement prepStmt = connect.prepareStatement(query);
//            prepStmt.setInt(1, Integer.parseInt(nilai));
            prepStmt.setString(1, id);
            prepStmt.setString(2, nama);
            prepStmt.setString(3, no_telp);
            prepStmt.setString(4, gender);

            prepStmt.executeUpdate();

            connect.close();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public ArrayList<DataUser> getAll() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            ArrayList<DataUser> result = new ArrayList<User.DataUser>();
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kintonexpress", "root", "");
            Statement stmt = connect.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM pengirim");
            
            while(rs.next()){
                result.add(new DataUser(rs.getString("nama"),rs.getString("userId")));
            }
            
            return result;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    @Override
    public boolean userMember() {
        this.memberStatus = true;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
            DataUser data = SessionHelper.loadConfigFromFile();
            String query = ""; 
            if(data!=null){
                query = "UPDATE pengirim SET subscribe=? WHERE userId='" + data.getId() + "'";
            }else{
                System.out.println("Error");
            }
            
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kintonexpress", "root", "");
            PreparedStatement prepStmt = connect.prepareStatement(query);
//            prepStmt.setInt(1, Integer.parseInt(nilai));
            prepStmt.setBoolean(1, memberStatus);
            
            prepStmt.executeUpdate();
            
            connect.close();
            
            return true;
        } catch (ClassNotFoundException E){
            System.out.println(E);
        } catch (SQLException ex) {
            Logger.getLogger(Pengirim.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;
    } 

    @Override
    public void feedback() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void rewards() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
