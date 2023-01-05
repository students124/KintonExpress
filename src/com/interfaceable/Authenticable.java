/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.interfaceable;

/**
 *
 * @author iolux
 */
public interface Authenticable {
    public abstract com.models.User.DataUser login();
    public abstract void logout();
    public abstract void profile();
    public abstract void registration();
    public abstract void twoStepVerification();
}
