/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler
{
        private IKeyEventHandler prevHandler ;
	private IKeyEventHandler nextHandler ;
	private String cvc = "" ;

      public void setNext( IKeyEventHandler next) {
        	this.nextHandler = next ;
      }	
      
       public void setPrev( IKeyEventHandler prev) {
        	this.prevHandler = prev ;
      }

	public String display() {
		if ( cvc.equals("") )
			return "[123]" + "  " ;
		else 
			return "[" + cvc + "]" + "  " ;
      }	

      public void key(String ch, int cnt) { 
	    if ( cnt >= 21 && cnt <= 23 && (cvc.length() <= 3)) {
			if( ch.matches("[0-9]*"))
				cvc += ch ;
		        else if ( ch.equalsIgnoreCase("X") )
                       {
                         cvc = cvc.length() >= 1 ? cvc.substring(0, cvc.length() - 1) : ""; 
                       } 
            }
	    else if ( nextHandler != null )
				nextHandler.key(ch, cnt) ;
	}	

	public void addSubComponent( IDisplayComponent c ) {
		return ; // do nothing
	}
	
        public String getKey(){
            return this.cvc;
          }
        
         public void wrapDecorator(Decorator d) {
         }
}