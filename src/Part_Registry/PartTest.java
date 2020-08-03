package Part_Registry;

/**
 * PartTest - A series of tests for the Part object
 * @author James Noyes  -  james.d.noyes@uscg.mil 
 * @version 0.2
 */
 public class PartTest {
   
   public static void main ( String[] args ) {
      
      
      //Object obj = new Object();
           
      System.out.println( "Creating 2 parts for toString test." );
      ExpendablePart p1 = new ExpendablePart( "Some Expendable Part", "123-45", "OU812", "1234-12-123-1234",5,3 );
      ConsumablePart p2 = new ConsumablePart( "Some Consumable Part", "19-8-45", "OU818", "4321-12-123-1234",3,19.99 );
      System.out.println( p1.toString() );
      System.out.println( p2.toString() );
      System.out.println( "" );
      System.out.printf( "Equality test passes: %b%n", equalityTest() );
      System.out.printf( "Constructor test passes: %b%n", constructorTest() );
      
   }
   
   /*
    * constructorTest - tests a constructor to ensure it creates the same kind of Part
    * @return boolean
    * 
    */
   private static boolean constructorTest() {
      ExpendablePart p1 = new ExpendablePart( "Some Part", "123-45", "OU812", "1234-12-123-1234",5,3 );

      ConsumablePart p2 = new ConsumablePart( "123-45", "OU812", "1234-12-123-1234" );
      p2.setName("Some Part");
      
      ExpendablePart p3 = new ExpendablePart( "123-45", "OU812"  );
      p3.setName("Some Part");
      p3.setNiin("1234-12-123-1234");
      
      ConsumablePart p4 = new ConsumablePart( "123-45",3,19.99 );
      p4.setName("Some Part");
      p4.setNcage("OU812");
      p4.setNiin("1234-12-123-1234");

      ExpendablePart p5 = new ExpendablePart( );
      p5.setName("Some Part");
      p5.setNumber("123-45");
      p5.setNcage("OU812");
      p5.setNiin("1234-12-123-1234");
      
      return( p1.equals(p2) && p1.equals(p3) && p1.equals(p4) && p1.equals(p5) );
   }
   
   /*
    * equalityTest - Tests the isEqual method
    * return boolean
    */
   private static boolean equalityTest () {
      ExpendablePart p1 = new ExpendablePart( "Some Part", "123-45", "OU812", "1234-12-123-1234",5,3 );
      ExpendablePart p2 = new ExpendablePart( "Some Part", "123-45", "OU812", "1234-12-123-1234",5,3 );
      ConsumablePart p3 = new ConsumablePart( "Some Other Part", "19-8-45", "OU818", "4321-12-123-1234",3,19.99 );
      
	  
	  if ( p1.equals(p1) ) System.out.println( "p1 = p1");
	  if ( p1.equals(p2) && p2.equals(p1) ) System.out.println( "p1 = p2 and p2 = p1"  );
          if ( p1.equals(p2) && p2.equals(p3) && p1.equals(p3) ) System.out.println( "p1 = p2, p2 = p3, p1 = p3"  );
	
      if ( p1.equals(null) )
      {
          System.out.println( "ERROR"  );
      }
      else
      {
          System.out.println( "non null passed"  );
      }
	
      return true;
  }
   
   
   
} // end Class PartTest    