
import java.text.DecimalFormat;

public class Sides extends Composite
{
    //PriceDecorator decorator = null ;
    
    public Sides ( String d )
    {
        super(d) ;
    }
   
    public void printDescription() {
        DecimalFormat fmt = new DecimalFormat("0.00");
        System.out.println( " " + description + " " + fmt.format(super.decorator.getPrice()) );
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
}

       