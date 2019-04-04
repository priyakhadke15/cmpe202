
/**
 * SpaceDecorator will add space to cardNumber .
 */
public class SpaceDecorator extends Decorator
{
    private String value = "";
    /**
     * Constructor for objects of class SpaceDecorator
     * @param c component to add the decorator
     */
    public SpaceDecorator(IDisplayComponent c)
    {
        super(c);
    }
    public String getKey(){
         value = super.getKey();
          return addSpace(value);
       }
     public String display() {
       return null;
     }	

    private String addSpace(String s){
        return s += " " ;
    }
    
    public void wrapDecorator(){}
}
