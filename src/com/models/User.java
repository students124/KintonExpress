/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.models;

import java.io.Serializable;
import java.util.ArrayList;
/**
 *
 * @author iolux
 */
public abstract class  User {

    /**
     *
     * @return
     */
    public abstract ArrayList<User.DataUser> getAll();
    public abstract User.DataUser login(String id);
    public abstract boolean register(String id, String nama,String no_telp ,String gender);
    
    public class DataUser implements Serializable{
        private String nama,id;
        
        public DataUser(String nama, String id){
            this.nama = nama;
            this.id = id;
        }        
        
        public String getId(){
            return this.id;
        }
        
        public String getNama(){
            return this.nama;
        }
        
    }
}
