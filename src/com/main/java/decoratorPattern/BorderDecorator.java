package main.com.java.decoratorPattern;

/**
 *
 * @author jrivill2
 */
public class BorderDecorator extends TextViewDecorator{

    public BorderDecorator(TextView textView) {
        super(textView);
    }
    
    @Override
    public String draw(){
        return textView.draw() + addBorder();
    }    
    
    private String addBorder () {
        return "+ border";
    }
    
}
