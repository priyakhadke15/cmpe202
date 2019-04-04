
/**
 * Decorator to define methods to add dynamically.
 */
public abstract class Decorator implements IDisplayComponent
{
    private IDisplayComponent num; 
    /**
     * Constructor for objects of class Decorator
     * @param c component to add decorator to
     */
    public Decorator(IDisplayComponent c){
        num = c;
    }
    public String display() {
       return null ;
    }								// Display all UI commponents on a Screen
    public void addSubComponent( IDisplayComponent c ) 	// Add a Nested / Subcomponent 
    { //do nothing
    }
    public String getKey(){
          return num.getKey();
       }
       
}
