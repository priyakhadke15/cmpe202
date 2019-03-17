
public class Client {

	public static void runTest() {
		BuildOrder buildorder = new BuildOrder();

		buildorder.setReceipt(new PaperReceipt1());
		Component theOrder = buildorder.getOrder();
		theOrder.printDescription();

		buildorder.setReceipt(new PackingReceipt1());
		theOrder = buildorder.getOrder();
		theOrder.printDescription();

	}
}
