import java.util.ArrayList;
import java.text.DecimalFormat;

public class Composite implements Component {

    protected ArrayList<Component> components = new ArrayList<Component>()  ;
    protected String description ;
    PriceDecorator decorator = null ;
    
    public Composite ( String d )
    {
        description = d ;
    } 
    
    public void setDecorator( PriceDecorator p )
    {
        this.decorator = p ;
    }
    
    public void printDescription() {
      DecimalFormat fmt = new DecimalFormat("0.00"); 
      Double price = 0.00;
      if (((new BuildOrder().getReceipt()) instanceof PaperReceipt)){
      System.out.println( "=======Customer's Copy==========" );     
      System.out.println( "================================" );  
      System.out.println( description );
      for (Component obj  : components)
        {
            obj.printDescription();
            price += Double.parseDouble(fmt.format(this.decorator.getPrice())) ;
        } 
       System.out.println( " " + "Sub Total" + "            $" + price );
       System.out.println( " " + "Tax      " + "            $" + (price*0.09));
       System.out.println( " " + "Total    " + "            $"+ (price+(price*0.09)));
       System.out.println( "================================" );  
    }
    else  if (((new BuildOrder().getReceipt()) instanceof PackingReceipt)){
      System.out.println( "=======Packing Receipt==========" );  
      System.out.println( "================================" );  
      System.out.println( description );
      for (Component obj  : components)
        {
            obj.printDescription();
        } 
       System.out.println( "================================" );  
    }    }

    public void addChild(Component c) {
        components.add( c ) ;
    }
     
    public void removeChild(Component c) {
        components.remove(c) ;
    }
     
    public Component getChild(int i) {
        return components.get( i ) ;
    }
    
     
}
 
