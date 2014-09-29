package main.com.java.decoratorPattern;

/**
 *
 * @author jrivill2
 */
public class TextViewDecorator implements TextView{
    
    protected TextView textView;
    
    public TextViewDecorator(TextView textView){
        this.textView = textView;
    }
    
    @Override
    public String draw() {
        return textView.draw();
    } 
    
}
