package User_registration;

import org.junit.Test;

public class TestFile {
      @Test
	 public void test1() {
    	  TestMethods t =new TestMethods();
    	  t.Testfname("Shaik");
	 }
      
      @Test
 	 public void test2() {
    	  TestMethods t =new TestMethods();
          t.Testlname("Vali");
 	 }
      
      @Test
	 public void test3() {
    	  TestMethods t =new TestMethods();
           t.Testmail("shaik123@gmail.com");
	 }
      
      @Test
	 public void test4() {
    	  TestMethods t =new TestMethods();
            t.Testnum("6303833290");
	 }
      
      @Test
	 public void test5() {
    	  TestMethods t =new TestMethods();
          t.Testpass("Shaik@13");
	 }
       
}
