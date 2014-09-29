/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.main.java.facadePattern;

/**
 *
 * @author jrivill2
 */
public class CodeGenerator implements CompilerInterface{

    @Override
    public void parser() {
    }

    @Override
    public void codeGenerator() {
        System.out.println("Generating Code");
    }

    @Override
    public void scanner() {
    }
    
}
