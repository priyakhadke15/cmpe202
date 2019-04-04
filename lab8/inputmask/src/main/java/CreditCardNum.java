/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler
{

	private IKeyEventHandler nextHandler ;
	private String number = "" ;
        private Decorator space ;
  
         public void setNext( IKeyEventHandler next) {
        	this.nextHandler = next ;
          }	

	public String display() {
		if ( number.equals("") )
			return "[4444 4444 4444 4444]" + "  " ;
		else return "[" + number + "]" + "  " ;
	}	

	public void key(String ch, int cnt) {
		if ( cnt <= 16 ){
			number += ch ;
			if(cnt % 4 == 0 && cnt < 16) { 
			    number = space.getKey();
			 }
                }
		else if ( nextHandler != null )
			nextHandler.key(ch, cnt) ;
	 }	
        public String getKey(){
            return this.number;
        }
	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
        public void wrapDecorator() {
             space = new SpaceDecorator(this);
        }
}