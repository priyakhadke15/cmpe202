import java.text.DecimalFormat;

public class CustomBurgerPaperReceipt extends CustomBurger implements ReceiptStrategy {

	public CustomBurgerPaperReceipt(String d) {
		super(d);
	}

	public Component getOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void printDescription() {
		DecimalFormat fmt = new DecimalFormat("0.00");
		System.out.println(" " + description + " " + fmt.format(this.decorator.getPrice()));
		for (Component obj : components) {
			obj.printDescription();
		}
	}

}
