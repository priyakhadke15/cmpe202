
public class BuildOrder {
    private static ReceiptStrategy receipt;
 
    public static void setReceipt (ReceiptStrategy r){
       receipt= r;
    }
    public static ReceiptStrategy getReceipt(){
        return receipt;
    }
    public static Component getOrder()
    {
        Composite order = new Composite( "FIVE GUYS" ) ;
        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "littlebaconburger"} ;
        b.setOptions( bo ) ;
        
        Patty p = new Patty( "Patty Options" ) ;
        String[] po = { "Bacon"} ;
        p.setOptions( po ) ;
        p.wrapDecorator( b ) ;
        
        //toppings free
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Lettuce", "Tomatoes", "Grilled Onions", "Jalapeno Peppers"} ;
        String[] where = {"onTop","onTop","onMeat","onMeat"};
        //t.setOptions( to ) ;
        t.wrapDecorator( p ) ;
       
        Sides sides = new Sides("Choose Your Sides");
        Fries fries = new Fries("Fries Options");
        String[] fo = {"Little Fries Cajun"} ;
        fries.setOptions( fo ) ;
        
        if (getReceipt() instanceof PaperReceipt ){
            
            t.setOptions( to,where ) ;
            // Setup Custom Burger Ingredients
            customBurger.setDecorator( t ) ;
            customBurger.addChild( b ) ;
            customBurger.addChild( p ) ;
            customBurger.addChild( t ) ;
            
        }
        
         if (getReceipt() instanceof PackingReceipt )
         {
         // Packing Receipt
        String[] packto = new String[to.length];
        for (int i=0; i< where.length ;i++) {
        if ( "onTop".equals(where[i]) ) {packto[i]=to[i];} 
        }
        for (int i=0; i< where.length ;i++) {
        if ( "onMeat".equals(where[i]) ) {packto[i]=to[i];} 
        }
        for (int i=0; i< where.length ;i++) {
        if ( "onDown".equals(where[i]) ) {packto[i]=to[i];} 
        }
        t.setOptions( packto,where) ;
        customBurger.setDecorator( t ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( t ) ;
        customBurger.addChild( p ) ;
       }
        sides.setDecorator( fries ) ;
        sides.addChild(fries);
        // Add Custom Burger to the Order
        
       // t.wrapDecorator(fries);
        order.addChild( customBurger );
        order.addChild( sides );
        
        order.setDecorator(b);
        order.setDecorator(fries);

      //  order. move the price decorator from customburger and leaf to composite
       return order ;
    }
}
/*
Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/