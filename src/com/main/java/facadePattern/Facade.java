package com.main.java.facadePattern;

/**
 *
 * @author jrivill2
 */
public class Facade{
    
    private final Parse parser;
    
    private final CodeGenerator codeGenerator;
    
    private final Scan scan;
    
    public Facade(){
        
        this.parser = new Parse();
        this.codeGenerator = new CodeGenerator();
        this.scan = new Scan();
        
    }

    public void parse() {
        parser.parser();
    }

    public void generateCode() {
        codeGenerator.codeGenerator();
    }

    public void scan() {
        scan.scanner();
    }

}
