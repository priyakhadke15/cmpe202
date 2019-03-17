
public class BuildOrder {
	private static ReceiptStrategy receipt;

	public static void setReceipt(ReceiptStrategy r) {
		BuildOrder.receipt = r;
	}

	public static ReceiptStrategy getReceipt() {
		return BuildOrder.receipt;
	}

	public static Component getOrder() {
		return BuildOrder.receipt == null ? null : BuildOrder.receipt.getOrder();
	}
}
/*
 * Counter Burger Menu: https://thecounterburger.emn8.com/?store=Times%20Square
 * 
 */