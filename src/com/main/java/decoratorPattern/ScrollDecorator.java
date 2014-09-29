package main.com.java.decoratorPattern;

/**
 *
 * @author jrivill2
 */
public class ScrollDecorator extends TextViewDecorator {

    public ScrollDecorator(TextView textView) {
        super(textView);
    }
    
    @Override
    public String draw() {
        return textView.draw() + addScroll();
    }

    private String addScroll() {
        return " + tiny scroll";
    }

}
