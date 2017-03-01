import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class HelloWorldTest 
    extends TestCase
{
   
    public Tester( String testName )
    {
        super( testName );
    }

 
    public static Test suite()
    {
        return new TestSuite( Tester.class );
    }

 
    public void testApp()
    {
        assertTrue( true );
    }
    
  
	
}
