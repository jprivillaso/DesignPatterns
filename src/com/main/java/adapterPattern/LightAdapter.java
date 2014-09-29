package com.main.java.adapterPatter;

/**
 *
 * @author jrivill2
 */
public class LightAdapter implements Switchable{

    private final Light light;
    
    public LightAdapter(){
        this.light = new Light();
    }
    
    @Override
    public void turnOn() {
        light.turnOn();
    }

    @Override
    public void turnOff() {
        light.turnOff();
    }
    
    @Override
    public Boolean getState(){
        return light.getState();
    }
    
}
