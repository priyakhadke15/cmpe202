
/**
 * Write a description of class DateDecorator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DateDecorator extends Decorator
{
    
    private String value = "";

    /**
     * Constructor for objects of class SpaceDecorator
     * @param c component to add the decorator
     */
    public DateDecorator(IDisplayComponent c)
    {
        super(c);
    }
    public String getKey(){
         value = super.getKey();
          return addDateSlash(value);
       }
     public String display() {
       return null;
     }	

    private String addDateSlash(String s){
        return s += "/" ;
    }
    
    public void wrapDecorator(){}
}
