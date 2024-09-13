package User_registration;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestFile {
      @Test
	 public void test1() {
    	  TestMethods t =new TestMethods();
    	boolean s=  t.Testfname("Shaik");
    	assertTrue(s);
	 }
      
      @Test
 	 public void test2() {
    	  TestMethods t =new TestMethods();
    	  boolean s= t.Testlname("Vali");
      	assertTrue(s);

 	 }
      
      @Test
	 public void test3() {
    	  TestMethods t =new TestMethods();
    	  boolean s=  t.Testmail("shaik123@gmail.com");
      	assertTrue(s);

	 }
      
      @Test
	 public void test4() {
    	  TestMethods t =new TestMethods();
    	  boolean s=   t.Testnum("6303833290");
      	assertTrue(s);

	 }
      
      @Test
	 public void test5() {
    	  TestMethods t =new TestMethods();
    	  boolean s=  t.Testpass("Shaik@13");
      	assertTrue(s);

	 }
       
}
