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
import com.helper.FileHelper;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author iolux
 */
public class Pengirim extends User{

    @Override
    public DataUser login(String id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            DataUser result = null;
            
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/kintonexpress", "root", "");
            Statement stmt = connect.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM user WHERE userId = '" + id  + "'");
            
            while(rs.next()){
                result = new DataUser(rs.getString("nama"), rs.getString("userId"), rs.getInt("userType"));
            }
            
            return result;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public boolean register(String id, String nama, String no_telp, int gender, int userType) {
        try {
            try {
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            
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
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM user");
            
            while(rs.next()){
                result.add(new DataUser(rs.getString("nama"),rs.getString("userId"),rs.getInt("userType")));
            }
            
            return result;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
