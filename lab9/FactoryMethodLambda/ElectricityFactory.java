import java.util.*;
import java.util.function.Supplier;

public class ElectricityFactory {
  final static Map<String, Supplier<Plan>> pList = new HashMap<>();
   static {
    pList.put("COMMERCIAL", Commercial::new);
    pList.put("DOMESTIC", Domestic::new);
    pList.put("INSTITUTIONAL", Institutional::new);
  }   
  public Plan getPlan(String planType){
     Supplier<Plan> plan = pList.get(planType.toUpperCase());
     if(plan != null) {
      return plan.get();
     }
     throw new IllegalArgumentException("No such plan " + planType.toUpperCase());
  }
}