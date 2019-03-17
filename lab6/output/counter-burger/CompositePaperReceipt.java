import java.text.DecimalFormat;

public class CompositePaperReceipt extends Composite implements ReceiptStrategy {

	public CompositePaperReceipt(String d) {
		super(d);
	}

	@Override
	public void printDescription() {
		DecimalFormat fmt = new DecimalFormat("0.00");
		Double price = 0.00;
		System.out.println("=======Customer's Copy==========");
		System.out.println("================================");
		System.out.println(description);
		for (Component obj : components) {
			obj.printDescription();
			if (obj instanceof Composite) {
				Composite o = (Composite) obj;
				if (o.decorator != null) {
					price += Double.parseDouble(fmt.format(o.decorator.getPrice()));
				}
			}
		}

		System.out.println(" " + "Sub Total" + "            $ " + fmt.format(price));
		System.out.println(" " + "Tax      " + "            $ " + fmt.format(price * 0.09));
		System.out.println(" " + "Total    " + "            $ " + fmt.format(price + (price * 0.09)));
		System.out.println("================================");
	}

	public Component getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

}
