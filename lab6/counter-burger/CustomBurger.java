
import java.text.DecimalFormat;

public class CustomBurger extends Composite
{
    //PriceDecorator decorator = null ;
    
    public CustomBurger ( String d )
    {
        super(d) ;
    }
    
    public void printDescription() {
     if (((new BuildOrder().getReceipt()) instanceof PaperReceipt)){
      DecimalFormat fmt = new DecimalFormat("0.00");
      System.out.println( " " + description + " " + fmt.format(this.decorator.getPrice()) );
      for (Component obj  : components)
        {
            obj.printDescription();
        } 
    }
    else if (((new BuildOrder().getReceipt()) instanceof PackingReceipt)){
      System.out.println( " " + description);
      for (Component obj  : components)
        {
            obj.printDescription();
        } 
    }
       
    }
}

       