
import java.text.DecimalFormat;

public class CustomBurger extends Composite
{
    //PriceDecorator decorator = null ;
    
    public CustomBurger ( String d )
    {
        super(d) ;
    }
    
    public void printDescription() {
     if (BuildOrder.getReceipt() instanceof PaperReceipt1){
      DecimalFormat fmt = new DecimalFormat("0.00");
      System.out.println( " " + description + " " + fmt.format(this.decorator.getPrice()) );
      for (Component obj  : components)
        {
            obj.printDescription();
        } 
    }
    else if (BuildOrder.getReceipt() instanceof PackingReceipt1){
      System.out.println( " " + description);
      for (Component obj  : components)
        {
            obj.printDescription();
        } 
    }
       
    }
}

       