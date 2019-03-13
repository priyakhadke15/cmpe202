public class Toppings extends LeafDecorator
{
    private String[] options ;
    
    
    public Toppings( String d )
    {
        super(d) ;
    }
    
    // 4 toppings free, extra +.75
    public void setOptions( String[] options )
    {
        this.options = options ;
       // if ( options.length > 4 )
          //  this.price += (options.length-4) * 0.75 ;
    }
    
    public String getDescription() 
    {
        String desc="";
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0)
            {
                if ( "Lettuce".equals(options[i]) ) desc += "LETTUCE\n   " ;
                if ( "Tomatoes".equals(options[i]) ) desc += "TOMATO\n   " ;
                if ( "Grilled Onions".equals(options[i]) ) desc += "G ONION\n   " ;
                if ( "Jalapeno Peppers".equals(options[i]) ) desc += "JALA Grilled\n   " ;
                if ( "Mayo".equals(options[i]) ) desc += "MAYO\n   " ;
                if ( "Pickels".equals(options[i]) ) desc += "PICKELS\n   " ;
                if ( "Grilled Mushrooms".equals(options[i]) ) desc +="G MUSHROOM\n   " ;
                if ( "Ketchup".equals(options[i]) ) desc +="KETCHUP\n   " ;
            }
            else 
            {
                if ( "Lettuce".equals(options[i]) ) desc = "LETTUCE\n   " ;
                if ( "Tomatoes".equals(options[i]) ) desc = "TOMATO\n   " ;
                if ( "Grilled Onions".equals(options[i]) ) desc = "G ONION\n   " ;
                if ( "Jalapeno Peppers".equals(options[i]) ) desc = "JALA Grilled\n   " ;
                if ( "Mayo".equals(options[i]) ) desc = "MAYO\n   " ;
                if ( "Pickels".equals(options[i]) ) desc = "PICKELS\n   " ;
                if ( "Grilled Mushrooms".equals(options[i]) ) desc = "G MUSHROOM\n   " ;
                if ( "Ketchup".equals(options[i]) ) desc = "KETCHUP\n   " ;
            }
        }        
        return desc ;
    }
    
}