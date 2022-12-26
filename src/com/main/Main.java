/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.main;

import com.controllers.PagesController;

/**
 *
 * @author iolux
 */

public class Main {
    static void app(){
        new PagesController().viewMainPage();
    }
    
    public static void main(String[] args) {
        app();
    }
}
