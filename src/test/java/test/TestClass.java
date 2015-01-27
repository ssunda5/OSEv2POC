package test; 

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.Ignore;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;



/**
 * Tests 
 *
 * @author rpandit1
 */
public class TestClass {

    @Test
    public void thisAlwaysPasses() {
    	   System.out.println("pass");
    }

    @Test
    @Ignore
    public void thisIsIgnored() {
    }
    
    /*
    
    @Test
    public void thisAlwaysFails() {
    	org.junit.Assert.assertTrue(true);
    }
    
    */

}