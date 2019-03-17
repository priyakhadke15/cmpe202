
public class CompositePackingReceipt extends Composite implements ReceiptStrategy {

	public CompositePackingReceipt(String d) {
		super(d);
	}

	@Override
	public void printDescription() {
		System.out.println("=======Packing Receipt==========");
		System.out.println("================================");
		System.out.println(description);
		for (Component obj : components) {
			obj.printDescription();
		}
		System.out.println("================================");
	}

	public Component getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
