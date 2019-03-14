public class Toppings extends LeafDecorator
{
    private String[] options ;
    private String[] where ;

    public Toppings( String d )
    {
        super(d) ;
    }
    
    // toppings free
    public void setOptions( String[] options )
    {
        this.options = options ;
    }
    public void setOptions( String[] options , String[] where )
    {
        this.options = options ;
        this.where = where ;
    }
    public String getDescription() 
    {
        String desc="";
        for ( int i = 0; i<options.length; i++ )
        {
            if(this.where != null){ if("onMeat".equals(this.where[i]) ) desc += "-> |" ; }
            if ( "Lettuce".equals(options[i]) ) desc += "LETTUCE\n   " ;
            if ( "Tomatoes".equals(options[i]) ) desc += "TOMATO\n   " ;
            if ( "Grilled Onions".equals(options[i]) ) desc += "G ONION\n   " ;
            if ( "Jalapeno Peppers".equals(options[i]) ) desc += "JALA Grilled\n   " ;
            if ( "Mayo".equals(options[i]) ) desc += "MAYO\n   " ;
            if ( "Pickels".equals(options[i]) ) desc += "PICKELS\n   " ;
            if ( "Grilled Mushrooms".equals(options[i]) ) desc +="G MUSHROOM\n   " ;
            if ( "Ketchup".equals(options[i]) ) desc +="KETCHUP\n   " ;
        }        
        return desc ;
    }
    
}