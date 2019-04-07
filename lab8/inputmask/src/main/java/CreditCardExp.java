/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */
public class CreditCardExp implements IDisplayComponent, IKeyEventHandler {

    private IKeyEventHandler nextHandler;
    private IKeyEventHandler prevHandler;
    private String date = "";
    private Decorator decorator;

    public void setNext(IKeyEventHandler next) {
        this.nextHandler = next;
    }

    public void setPrev(IKeyEventHandler prev) {
        this.prevHandler = prev;
    }

    public String display() {
        if (date.equals(""))
            return "[MM/YY]" + "  ";
        else
            return "[" + date + "]" + "  ";
    }

    public void key(String ch, int cnt) {
        if (cnt >= 17 && cnt <= 20) {
            if (ch.matches("[0-9]*")) {
                date += ch;
                if (cnt == 18) {
                    date = decorator.getKey();
                }
            } else if (ch.equalsIgnoreCase("X")) {
                if (cnt == 20) {
                    if (nextHandler != null) {
                        nextHandler.key(ch, cnt + 1);
                    }
                } else if (cnt == 17)
                    date = date.length() == 3 ? date.substring(0, date.length() - 2) : "";
                else
                    date = date.length() >= 1 ? date.substring(0, date.length() - 1) : "";
            }
        } else if (nextHandler != null)
            nextHandler.key(ch, cnt);
    }

    public void addSubComponent(IDisplayComponent c) {
        return; // do nothing
    }

    public String getKey() {
        return this.date;
    }

    public void wrapDecorator(Decorator d) {
        this.decorator = d;
    }
}