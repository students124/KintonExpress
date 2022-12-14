/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.user;

/**
 *
 * @author iolux
 */
public class KurirAntar extends User {
    protected String tipe_kendaraan;
    
    public KurirAntar(String name, String no_tlp, boolean gender){
        super(name,no_tlp,gender);
    }
    
    public void setTipeKendaraan(String tipe_kendaraan){
        this.tipe_kendaraan = tipe_kendaraan;
    }
    
    public String getTipeKendaraan(){
        return this.tipe_kendaraan;
    }
    
    public void login(){
        
    }
    
    public void logout(){
        
    }
    
    public void profile(){
        
    }
    
    public void registration(){
        
    }
    
    public void twoStepVerfication(){
        
    }
    
//    public Pengirim lastLocationDetected(){
//        
//    }
}
