package User_registration;

import static org.junit.Assert.assertTrue;

import java.util.regex.Pattern;

import org.junit.Test;

public class TestFile   {
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
      
      // using functional interfaces
       @FunctionalInterface
      interface i1{
 	public void Testfname1(String fname) ;
       }
 	
      @FunctionalInterface
      interface i2{ 
    	  public void Testlname(String lname);
      
      }
  		//return Pattern.matches("[A-Z]{1}[a-z]{2,}", lname);

      @FunctionalInterface
      interface i3{
    	  public  void Testmail(String mail) ;
      }
      
   		
  		@FunctionalInterface
  	     interface i4{
  			public  void Testnum(String num);
  		}
 
  		 @FunctionalInterface
  	     interface i5{
  			public void Testpass(String pass);
  		 }
    
  		 
   		     
  		   
  		 
  
  		 
  		 public static void main(String[] args) {
  	  		 //using lambda  expressions

  			 i1 m1=(fname)  ->   {
    			   boolean b= Pattern.matches("[A-Z]{1}[a-z]{2,}", fname);
            System.out.println(b); 
            };
            
              i2 m2=(lname)  ->   {   boolean b= Pattern.matches("[A-Z]{1}[a-z]{2,}", lname);
              System.out.println(b); 
              };

              
              i3 m3=(mail)   ->    {  boolean b= Pattern.matches("[a-zA-Z0-9+%-]+.[a-z]*@[a-z]+.[a-z]+.[a-z]*", mail);
              System.out.println(b); 

              };
              i4 m4=(num)    ->   {   boolean b= Pattern.matches("\\d{10}+", num);
              System.out.println(b); 

              };
              i5 m5=(pass)   ->   {
            	  boolean b= Pattern.matches("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d!@#$%^&*()]{8,}$", pass);
                  System.out.println(b); 

              };

		       m1.Testfname1("Shaik");
               m2.Testlname("Sha"); 
               m3.Testmail("shaiknaveed@gmail.com");
               m4.Testnum("6303833290");
               m5.Testpass("Shaik@123");		
  	
	  			
  		 }
  		 }
        
      
       
