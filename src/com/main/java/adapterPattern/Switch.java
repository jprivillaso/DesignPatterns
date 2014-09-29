package com.main.java.adapterPatter;

/**
 *
 * @author jrivill2
 */
public class Switch {
    
    public static void main(String [] args){
        
        Switchable adapter = new LightAdapter();
        adapter.turnOn();
        System.out.println("Actual State is: " + adapter.getState());
        adapter.turnOff();
        System.out.println("Actual State is: " + adapter.getState());
        
    }
    
}
