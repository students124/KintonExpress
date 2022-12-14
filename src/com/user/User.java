/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.user;

/**
 *
 * @author iolux
 */
public class User {
    private String name,no_tlp;
    private boolean gender;
    protected String id;
    
    public User(String name, String no_tlp, boolean gender){
        this.name = name;
        this.no_tlp = no_tlp;
        this.gender = gender;
    }
}
