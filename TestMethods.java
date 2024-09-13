package User_registration;

import java.util.regex.Pattern;

public class TestMethods {

	public boolean Testfname(String fname) {
		return Pattern.matches("[A-Z]{1}[a-z]{2,}", fname);
	}
	
     public boolean Testlname(String lname) {
 		return Pattern.matches("[A-Z]{1}[a-z]{2,}", lname);

     }
     public boolean Testmail(String mail) {
 		return Pattern.matches("[a-zA-Z0-9+%-]+.[a-z]*@[a-z]+.[a-z]+.[a-z]*", mail);

	}
     public boolean Testnum(String num) {
 		return Pattern.matches("\\d{10}+", num);

	}
     public boolean Testpass(String pass) {
		
	return Pattern.matches("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d!@#$%^&*()]{8,}$", pass);

     }
}
