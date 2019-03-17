
public class Client {

	public static void runTest() {
		BuildOrder.setReceipt(new PaperReceipt());
		Component theOrder = BuildOrder.getOrder();
		theOrder.printDescription();

		BuildOrder.setReceipt(new PackingReceipt());
		theOrder = BuildOrder.getOrder();
		theOrder.printDescription();

	}
}
