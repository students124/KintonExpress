/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.helper;

import java.util.Date;

/**
 *
 * @author iolux
 */
public class OperationalHelper {
    public static String operational(){
        Date date = new Date();
        int hours = date.getHours();
        
        if (hours >= 8 && hours <= 21){
            return "OPEN";
        }
        
        return "CLOSE";
    }
}
