  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "FIVE GUYS" ) ;

        CustomBurger customBurger = new CustomBurger( "Build Your Own Burger" ) ;
        
        // base price for 1/3 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "littlebaconburger"} ;
        b.setOptions( bo ) ;
        
        //toppings free
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = { "Lettuce", "Tomatoes", "Grilled Onions", "Jalapeno Peppers"} ;
        t.setOptions( to ) ;
        t.wrapDecorator( b ) ;
       
        Sides sides = new Sides("Choose Your Sides");
        Fries fries = new Fries("Fries Options");
        String[] fo = {"Little Fries Cajun"} ;
        fries.setOptions( fo ) ;
        
        // Setup Custom Burger Ingredients
        customBurger.setDecorator( t ) ;
        customBurger.addChild( b ) ;
        customBurger.addChild( t ) ;
        sides.setDecorator( fries ) ;
        sides.addChild(fries);
      
        // Add Custom Burger to the ORder
        order.addChild( customBurger );
        order.addChild( sides );
        return order ;
    }
}


/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/