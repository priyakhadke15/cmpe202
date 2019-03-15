public class Fries extends LeafDecorator
{
    private String[] options ;
    
    
    public Fries( String d )
    {
        super(d) ;
    }
    
    public void setOptions( String[] options )
    {
        this.options = options ;
         for ( int i = 0; i<options.length; i++ )
        { 
          if ( "Little Fries Cajun".equals(options[i]) ) this.price += 2.79 ;
          if ( "Regular Fries Cajun".equals(options[i]) ) this.price += 3.39 ;
          if ( "Large Fries Cajun".equals(options[i]) ) this.price += 5.59 ;
        }
    }
    
    public String getDescription() 
    {
        String desc = "" ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) {
                if ( "Little Fries Cajun".equals(options[i]) ) desc +="LTL CAJ\n   " ;
                if ( "Regular Fries Cajun".equals(options[i]) ) desc +="REG CAJ\n   " ;
                if ( "Large Fries Cajun".equals(options[i]) ) desc +="LAR CAJ\n   " ;
            }
            else 
            {
                if ( "Little Fries Cajun".equals(options[i]) ) desc ="LTL CAJ\n   " ;
                if ( "Regular Fries Cajun".equals(options[i]) ) desc ="REG CAJ\n   " ;
                if ( "Large Fries Cajun".equals(options[i]) ) desc ="LAR CAJ\n   " ;
            } 
        }  
        return desc ;
    }
    
}