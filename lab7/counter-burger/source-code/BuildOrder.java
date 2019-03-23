  

public class BuildOrder {

    public static Component getOrder()
    {
        Composite order = new Composite( "Order" ) ;
       // order.addChild(new Leaf("Crispy Onion Strings", 5.50 ));
       // order.addChild(new Leaf("The Purist", 8.00 ));

        CustomBurger customBurger1 = new CustomBurger( "Build Your Own Burger" ) ;
        // base price for 1/2 lb
        Burger b = new Burger( "Burger Options" ) ;
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun." } ;
        b.setOptions( bo ) ;
        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese( "Cheese Options" ) ;
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" } ;
        c.setOptions( co ) ;
        c.wrapDecorator( b ) ;
        
        CheesePreminum pc = new CheesePreminum( "Preminum Cheese Options" ) ;
        co = new String[] { "Danish Blue Cheese"} ;
        pc.setOptions( co ) ;
        pc.wrapDecorator( c ) ;
        
        // 1 sauce free, extra +.50
        Sauce s = new Sauce( "Sauce Options" ) ;
        String[] so = { "Mayoneese" , "Thai Peanut Sauce" } ;
        s.setOptions( so ) ;
        s.wrapDecorator( pc ) ;
        
        // toppings free
        Toppings t = new Toppings( "Toppings Options" ) ;
        String[] to = {"Dill Pickels Chips","Black Olives", "Spicy Pickles" } ;
        t.setOptions( to ) ;
        t.wrapDecorator( s ) ;
        
        // premium topping per selection
        Premium p = new Premium( "Premium Options" ) ;
        String[] po = { "Marinated Tomotoes" } ;
        p.setOptions( po ) ;
        p.wrapDecorator( t ) ;
        
        Bun bun = new Bun("Bun Options");
        String[] buno = { "Ciabatta(Vegan)" } ;
        bun.setOptions( buno ) ;
        bun.wrapDecorator( p ) ;
        
        Side side = new Side("Side Options");
        String[] sideo = { "Shoestring Fries" } ;
        side.setOptions( sideo ) ;
        side.wrapDecorator( bun ) ;
        
        // Setup Custom Burger Ingredients
        customBurger1.setDecorator( side ) ;
        customBurger1.addChild( b ) ;
        customBurger1.addChild( c ) ;
        customBurger1.addChild( pc ) ;
        customBurger1.addChild( s ) ;
        customBurger1.addChild( t ) ;
        customBurger1.addChild( p ) ;
        customBurger1.addChild( bun ) ;
        customBurger1.addChild( side ) ;
        
        
        CustomBurger customBurger2 = new CustomBurger( "Build Your Own Burger" ) ;
        Burger b2 = new Burger( "Burger Options" ) ;
        bo = new String[] { "Harmone and Antibiotic free beef*", "1/3lb.", "On A Bun" } ;
        b2.setOptions( bo ) ;
        
        Cheese c2 = new Cheese( "Cheese Options" ) ;
        co = new String[] { "Smoked Gauda", "Greek Feta" } ;
        c2.setOptions( co ) ;
        c2.wrapDecorator( b2 ) ;
        
        CheesePreminum pc2 = new CheesePreminum( "Preminum Cheese Options" ) ;
        co = new String[] { "Fresh Mozzerella"} ;
        pc2.setOptions( co ) ;
        pc2.wrapDecorator( c2 ) ;
        
        Sauce s2 = new Sauce( "Sauce Options" ) ;
        so = new String[]{ "Habenero Salsa"} ;
        s2.setOptions( so ) ;
        s2.wrapDecorator( pc2 ) ;
        
        Toppings t2 = new Toppings( "Toppings Options" ) ;
        to = new String[] {"Crushed Peanuts" } ;
        t2.setOptions( to ) ;
        t2.wrapDecorator( s2 ) ;
        
        Premium p2 = new Premium( "Premium Options" ) ;
        po = new String[] { "Marinated Tomotoes" , "Sunny Side Up Egg" } ;
        p2.setOptions( po ) ;
        p2.wrapDecorator( t2 ) ;
        
        Bun bun2 = new Bun("Bun Options");
        buno = new String[] { "Gluten-Free Bun" } ;
        bun2.setOptions( buno ) ;
        bun2.wrapDecorator( p2 ) ;
        
        Side side2 = new Side("Side Options");
        sideo =  new String[] { "Shoestring Fries" } ;
        side2.setOptions( sideo ) ;
        side2.wrapDecorator( bun2 ) ;
        
        customBurger2.setDecorator( side2 ) ;
        customBurger2.addChild( b2 ) ;
        customBurger2.addChild( c2 ) ;
        customBurger2.addChild( pc2 ) ;
        customBurger2.addChild( s2 ) ;
        customBurger2.addChild( t2 ) ;
        customBurger2.addChild( p2 ) ;
        customBurger2.addChild( bun2 ) ;
        customBurger2.addChild( side2 ) ;
        
        // Add Custom Burger to the ORder
        order.addChild( customBurger1 );
        order.addChild( customBurger2 );
        return order ;
    }
}

/*

Counter Burger Menu:
https://thecounterburger.emn8.com/?store=Times%20Square

*/