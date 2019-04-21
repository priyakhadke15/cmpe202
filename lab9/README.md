
Lab 9 lambda expressions

The solution for this lab is discussed using Factory Method design pattern.

The orginal implementation of the factory method pattern includes,
Product Abstract Class : Invkoes the factory to get the relevant electricity plan.
Plant Factory,College Factory and Home factory are factory classes using the plan.
Plan (Commercial,Domestic and Institutional) are the products for electricty.

Java Lambda :
In Java Lambda, we can refer to constructors like we refer to methods, by using method references. 
For example : 
final static Map<String, Supplier<Plan>> pList = new HashMap<>();
   static {
    pList.put("COMMERCIAL", Commercial::new);
    pList.put("DOMESTIC", Domestic::new);
    pList.put("INSTITUTIONAL", Institutional::new);
  }   
This was a concise and clear way to construct relevant objects.
