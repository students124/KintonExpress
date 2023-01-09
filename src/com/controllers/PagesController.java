/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.controllers;

import com.models.User;
import com.helper.SessionHelper;
import com.views.*;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.concurrent.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import com.models.Pengirim;

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
    private AddBarang addBarang;
    private ListBarangPengirim listBarang;
    private User.DataUser user;
    private RegistAdmin registAdmin;
    private RegistPengirim registKirim;
    private RegistKurir registKurir;
    private RegistOption registOpt;
    private DashboardKurir kurir;
    private ListBarangPengirim barangPengirim;
    private ListBarangKurir barangKurir;
    private Rewards reward;
    private Profile profil;
    private UpdateLocation location;

    
    public PagesController() throws ClassNotFoundException, SQLException{
        this.about = new About();
        this.dashboardadmin = new DashboardAdmin();
        this.dashboardpengirim = new DashboardPengirim();
        this.login = new Login();
        this.addBarang = new AddBarang();
        this.listBarang = new ListBarangPengirim();
        this.home = new Home();
        this.registAdmin = new RegistAdmin();
        this.registKirim = new RegistPengirim();
        this.registKurir = new RegistKurir();
        this.registOpt = new RegistOption();
        this.kurir = new DashboardKurir();
        this.barangPengirim = new ListBarangPengirim();
        this.barangKurir = new ListBarangKurir();
        this.reward = new Rewards();
        this.profil = new Profile();
        this.location = new UpdateLocation();
    }
       
//    Views
    public void viewMainPage(){
        this.home.setVisible(true);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.addBarang.setVisible(false);
        this.listBarang.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewLoginPage(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(true);
        this.addBarang.setVisible(false);
        this.listBarang.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewAboutPage(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(true);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.addBarang.setVisible(false);
        this.listBarang.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewAdminPage(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(true);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.addBarang.setVisible(false);
        this.listBarang.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewPengirimPage(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(true);
        this.login.setVisible(false);
        this.addBarang.setVisible(false);
        this.listBarang.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewListBarang(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.listBarang.setVisible(true);
        this.addBarang.setVisible(false);
        this.login.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewAddBarang(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.listBarang.setVisible(false);
        this.addBarang.setVisible(true);
        this.login.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewRegistration(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    
    public void viewRegistOption(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(true);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewRegistAdmin(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.registAdmin.setVisible(true);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewRegistPengirim(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(true);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewRegistKurir(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(true);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewDashboardKurir(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(true);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewBarangPengirim(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(true);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewBarangKurir(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(true);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewRewards(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(true);
        this.profil.setVisible(false);
        this.location.setVisible(false);
    }
    
    public void viewProfile(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(true);
        this.location.setVisible(false);
    }
    
    public void viewUpdateLocation(){
        this.reset();
        
        this.home.setVisible(false);
        this.about.setVisible(false);
        this.dashboardadmin.setVisible(false);
        this.dashboardpengirim.setVisible(false);
        this.login.setVisible(false);
        this.registAdmin.setVisible(false);
        this.registKirim.setVisible(false);
        this.registKurir.setVisible(false);
        this.registOpt.setVisible(false);
        this.kurir.setVisible(false);
        this.barangPengirim.setVisible(false);
        this.barangKurir.setVisible(false);
        this.reward.setVisible(false);
        this.profil.setVisible(false);
        this.location.setVisible(true);
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
    
    public boolean member(){
        Pengirim kirim = new Pengirim();
        return kirim.userMember();
    }
}