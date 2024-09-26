package User_registration;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
public class Mail_validation {
@ParameterizedTest
@CsvSource({
    "john.doe@example.com, true",     
    "jane.doe@subdomain.example.com, true",   
    "invalid-email, false",           
    "john.doe@, false",              
    "john.doe@example, false",       
    "@example.com, false",            
    "john.doe@.com, false"})

public void testMail(String mail,boolean expected) {
	
}
 

}
