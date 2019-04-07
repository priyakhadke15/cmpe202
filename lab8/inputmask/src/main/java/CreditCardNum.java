/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */
public class CreditCardNum implements IDisplayComponent, IKeyEventHandler {

    private IKeyEventHandler nextHandler;
    private IKeyEventHandler prevHandler;
    private String number = "";
    private Decorator decorator;

    public void setNext(IKeyEventHandler next) {
        this.nextHandler = next;
    }
    public void setPrev(IKeyEventHandler prev) {
        this.prevHandler = prev;
    }
    public String display() {
        if (number.equals(""))
            return "[4444 4444 4444 4444]" + "  ";
        else return "[" + number + "]" + "  ";
    }
    public void key(String ch, int cnt) {
        if (cnt <= 16) {
            if (ch.matches("[0-9]*")) {
                number += ch;
                if (cnt % 4 == 0 && cnt < 16) {
                    number = decorator.getKey();
                }
            } else if (ch.equalsIgnoreCase("X")) {
                if (cnt == 16) {
                    if (nextHandler != null) {
                        nextHandler.key(ch, cnt + 1);
                    }
                } else if (cnt % 4 == 0 && cnt != 0) {
                    number = number.substring(0, number.length() - 2);
                } else
                    number = number.length() >= 1 ? number.substring(0, number.length() - 1) : "";
            }
        } else if (nextHandler != null)
            nextHandler.key(ch, cnt);
    }
    public String getKey() {
        return this.number;
    }
    public void addSubComponent(IDisplayComponent c) {
        return; // do nothing
    }
    public void wrapDecorator(Decorator d) {
        this.decorator = d;
    }
}