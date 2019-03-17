
public class SidesPackingReceipt extends Sides implements ReceiptStrategy {

	public SidesPackingReceipt(String d) {
		super(d);
	}

	@Override
	public void printDescription() {
		System.out.println(" " + description);
		for (Component obj : components) {
			obj.printDescription();
		}
	}

	public Component getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
