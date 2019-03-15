public class Patty extends LeafDecorator
{
    private String[] options ;
    public Patty( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
        this.options = options ;
    }
    
    public String getDescription() 
    {
        String desc = "{{{{ " ;
        for ( int i = 0; i<options.length; i++ )
        {
        if ( "Bacon".equals(options[i]) )   desc += "BACON"  ;
        if ( "Ham".equals(options[i]) )     desc += "HAM"  ;
        if ( "Cheese".equals(options[i]) )  desc += "CHEESE"  ;
        } 
        desc+= " }}}}";
        return desc ;
    }
    
}