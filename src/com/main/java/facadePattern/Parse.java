package com.main.java.facadePattern;

/**
 *
 * @author jrivill2
 */
public class Parse implements CompilerInterface{

    @Override
    public void parser() {
        System.out.println("Parsing");
    }

    @Override
    public void codeGenerator() {
    }

    @Override
    public void scanner() {
    }
    
}
