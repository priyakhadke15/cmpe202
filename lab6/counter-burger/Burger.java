public class Burger extends LeafDecorator
{
    private String[] options ;
    
    
    public Burger( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {   
            if ( "Hamburger".equals(options[i]) ) this.price += 6.39 ;
            if ( "cheeseburger".equals(options[i]) ) this.price += 7.19 ;
            if ( "baconburger".equals(options[i]) ) this.price += 7.19 ;
            if ( "baconcheeseburger".equals(options[i]) ) this.price += 7.79 ;
            if ( "littlehamburger".equals(options[i]) ) this.price += 4.59 ;
            if ( "littlecheeseburger".equals(options[i]) ) this.price += 5.29 ;
            if ( "littlebaconburger".equals(options[i]) ) this.price += 5.59 ;
            if ( "littlebaconcheeseburger".equals(options[i]) ) this.price += 6.19 ;
        }
    }
    
    public String getDescription() 
    {
        String desc = "" ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) {
                if ( "littlebaconburger".equals(options[i]) ) desc +="LBB\n   " ;
            }
            else 
            {
                if ( "littlebaconburger".equals(options[i]) ) desc = "LBB\n   " ;
            }  
        }        
        return desc ;
    }
    
}
