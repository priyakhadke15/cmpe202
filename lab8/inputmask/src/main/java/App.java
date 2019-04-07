/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private Decorator space;
    private Decorator dateSlash;
   
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();
        dateSlash = new DateDecorator(exp);
        space = new SpaceDecorator(num);
        
        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);
        
        num.wrapDecorator(space);
        exp.wrapDecorator(dateSlash);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        if (ch.equalsIgnoreCase("X")){
            if (count == 0) {
                return;
            }
            count--;
        } else if(count == 23) {
            return;
        } else {
            count++;
        }
        screen.key(ch, count);
    }

}

