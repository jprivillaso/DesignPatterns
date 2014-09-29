package main.com.java.decoratorPattern;

/**
 *
 * @author jrivill2
 */
public class SimpleView implements TextView{

    @Override
    public String draw() {
        return "Base Text View";
    }

}
