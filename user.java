package User_registration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class user {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
         while (true) {
            System.out.println("Enter First name: ");
            String  fn = s.next();
            
            if (Pattern.matches("[A-Z]{1}[a-z]{2,}", fn)) {
                break;
            } else {
                System.out.println("First name is not valid. Please enter again.");
            }
        }

         while (true) {
            System.out.println("Enter Last name: ");
            String ln = s.next();
            
            if (Pattern.matches("[A-Z]{1}[a-z]{2,}", ln)) {
                break;
            } else {
                System.out.println("Last name is not valid. Please enter again.");
            }
        }

         while (true) {
            System.out.println("Enter your Gmail: ");
            String   gm = s.next();
            
			  if(Pattern.matches("[a-zA-Z0-9+%-]+.[a-z]*@[a-z]+.[a-z]+.[a-z]*", gm)) {
                break;
            } else {
                System.out.println("Invalid Gmail. Please enter again.");
            }
        }

          while (true) {
            System.out.println("Enter Mobile number: ");
            String ph = s.next();
            
            if (Pattern.matches("\\d{10}+", ph)) {
                break;
            } else {
                System.out.println("Invalid number. Please enter again.");
            }
        }

           while (true) {
            System.out.println("Enter password: ");
            String p = s.next();
            
            if (Pattern.matches("^(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d!@#$%^&*()]{8,}$", p)) {
                System.out.println("Registration Successful");
                break;  
            } else {
                System.out.println("Invalid password. Please try again.");
            }
        }

        s.close();
    }
}
 