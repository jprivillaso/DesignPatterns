package main.com.java.decoratorPattern;

/**
 *
 * @author jrivill2
 */
public class Client {
    
    public static void main(String [] args){
        
        TextView textView = new ScrollDecorator(new SimpleView());
        System.out.println(textView.draw());
        
    }
    
}
