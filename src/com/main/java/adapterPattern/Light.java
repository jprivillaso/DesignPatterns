/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.main.java.adapterPatter;

/**
 *
 * @author jrivill2
 */
public class Light {
    
    private Boolean state;
    
    public void turnOn(){
        state = true;
    }
    
    public void turnOff(){
        state = false;
    }
    
    public Boolean getState() {
        return state;
    }
    
}
