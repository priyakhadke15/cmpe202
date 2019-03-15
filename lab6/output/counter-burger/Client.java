
public class Client {

    public static void runTest()
    {
        BuildOrder buildorder = new BuildOrder();
        
        buildorder.setReceipt(new PaperReceipt("Customer's Copy"));
        Component theOrder = buildorder.getOrder() ;
        theOrder.printDescription();
        
        buildorder.setReceipt(new PackingReceipt("Packing Receipt"));
        theOrder = buildorder.getOrder() ;
        theOrder.printDescription();

    }
}
 
