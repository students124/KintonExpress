/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.helper;

import java.io.*;
import com.models.User;

/**
 *
 * @author iolux
 */
public class SessionHelper implements Serializable{
    private static final String CONFIG_FILENAME = "session.txt";
    
    public static void saveConfigToFile(User.DataUser appC) {
        try{
            ObjectOutputStream OOS;
            try (FileOutputStream FOS 
                    = new FileOutputStream(SessionHelper.CONFIG_FILENAME)) {
                OOS = new ObjectOutputStream(FOS);
                OOS.writeObject(appC);
                FOS.close();
            }
            OOS.close();
            
        } catch(IOException e){
            System.out.println(e);
        }
        
    }
    
    public static User.DataUser loadConfigFromFile() throws ClassNotFoundException{
        try{
            FileInputStream FIS 
                    = new FileInputStream(SessionHelper.CONFIG_FILENAME);
            ObjectInputStream OIS 
                    = new ObjectInputStream(FIS);
            
            User.DataUser appC 
                    = (User.DataUser) OIS.readObject();
            
            FIS.close();
            OIS.close();
            
            return appC;
            
        }catch (IOException e){
            System.out.println(e);
        }
        
        return null;
    }
}
