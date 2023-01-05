/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controllers;

import com.models.User;
import com.helper.FileHelper;
import com.views.*;
import java.io.Serializable;

/**
 *
 * @author iolux
 */
public class PagesController implements Serializable{
    private About about;
    private DashboardAdmin dashboardadmin;
    private DashboardPengirim dashboardpengirim;
    private Login login;
    private Home home;
    private User.DataUser user;
    
    public PagesController(){
        this.about = new About();
        this.dashboardadmin = new DashboardAdmin();
        this.dashboardpengirim = new DashboardPengirim();
        this.login = new Login();
        this.home = new Home();
    }
       
//    Views
    public void viewMainPage(){
        this.home.setVisible(true);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
    }
    
    public void viewLoginPage(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(true);
    }
    
    public void viewAboutPage(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(true);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
    }
    
    public void viewAdminPage(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(true);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
    }
    
    public void viewPengirimPage(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(true);
        this.login.setVisible(false);
    }
    
    public void viewUserMenu() throws ClassNotFoundException{
        
        User.DataUser rs = FileHelper.loadConfigFromFile();
        
        this.setUser(rs);
        
        this.reset();
        if (this.user != null){
            switch(this.user.getTypeUser()){
                case 1:
                    this.viewAdminPage();
                    break;
                
                case 2:
                    this.viewPengirimPage();
                    break;
            }
        }else{
            this.viewLoginPage();
        }
    }
    
    
//    Logic?
    
    public void setUser(User.DataUser user){
        this.user = user;
    }
    
    public void reset(){
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
    }
}
