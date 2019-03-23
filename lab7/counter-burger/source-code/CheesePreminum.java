public class CheesePreminum extends LeafDecorator
{
    private String[] options ;
    
    
    public CheesePreminum( String d )
    {
        super(d) ;
    }
    
    // 1.5 per selection cheese free
    public void setOptions( String[] options )
    {
        this.options = options ;
       // if ( options.length > 1 )
            this.price += (options.length) * 1.50 ;
    }
    
    public String getDescription() 
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }        
        return desc ;
    }
    
}