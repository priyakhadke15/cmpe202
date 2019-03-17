
public class PaperReceipt extends Composite implements ReceiptStrategy
{
   public PaperReceipt ( String d )
    {
        super(d);
    }
    @Override
    public void printDescription() {
        
        System.out.println( description );
        for (Component obj  : components)
        {
            obj.printDescription();
        }
    }
	public Component getOrder() {
		// TODO Auto-generated method stub
		return null;
	}
    
}
