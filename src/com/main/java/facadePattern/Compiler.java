package com.main.java.facadePattern;

/**
 *
 * @author jrivill2
 */
public class Compiler {
    
    public static void main(String [] args) {
    
        Facade compiler = new Facade();
        
        compiler.scan();
        compiler.parse();
        compiler.generateCode();
        
    }          
    
}
