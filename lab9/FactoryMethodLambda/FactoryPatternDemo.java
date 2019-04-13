import java.util.*;
import java.util.function.Supplier;

public class FactoryPatternDemo {
  public static void main(String[] args) {
    Supplier<ElectricityFactory> electricityFactory =  ElectricityFactory::new;
    
    //call draw method of Commercial
    electricityFactory.get().getPlan("Commercial").getRate();
    //call getRate method of Domestic
    electricityFactory.get().getPlan("Domestic").getRate();      
    //call getRate method of Domestic
    electricityFactory.get().getPlan("Institutional").getRate();      
  }
}