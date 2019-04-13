 

public class RunTest {
    
    public static void main( String [] args )
    {
        System.out.println( "Testing Plant Factory...") ;
        PlantFactory pf = new PlantFactory() ;
        pf.buildOrder() ;
        
        System.out.println( "Testing College Factory...") ;
        CollegeFactory vf = new CollegeFactory() ;
        vf.buildOrder() ;

        System.out.println( "Testing Home Factory...") ;
        HomeFactory tf = new HomeFactory() ;
        tf.buildOrder() ;
        
    }

}
