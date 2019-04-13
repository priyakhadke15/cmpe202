 

public abstract class Creator {
    String order = "Default Order" ;
    public abstract Plan getPlan();
	public void takeOrder(String order) {
        this.order = order ;
    }
	public void buildOrder() {
         Plan plan = getPlan() ;
        System.out.println( "Building Electicity Plan : " + this.order );
        System.out.println( "Plan Selected..." + plan.getClass().getName() );
        System.out.println( "Electricity charge rate..." + plan.getRate() );
       // System.out.println( "Paint...");
        //System.out.println( "Ship...");
    }
 }



