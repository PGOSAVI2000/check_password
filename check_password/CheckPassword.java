/*package com.check_password;

public class CheckPassword {

	public static void main(String[] args) {
		String userPassword = "1234567890!abcdAEA";
		System.out.println(passwordStrength(userPassword));
		
	}

	public static int passwordStrength(String password) {
		
		int score = 0;
		int length = password.length();
		
		if(length >= 8 && length <= 10)
		{
			score += 1;
		}
		
		else if(length >= 11 && length <= 15)
		{
			score += 2;
		}
		
		else if(length >=16)
		{
			score += 3;
		}
		
		if(password.matches("(?=.*[a-z]).*"))
		{
			score++;
		}
		if(password.matches("(?=.*[A-Z]).*"))
		{
			score++;
		}
		if(password.matches("(?=.*[0-9]).*"))
		{
			score++;
		}
		if(password.matches("(?=.*[!@#$%^&*]).*"))
		{
			score++;
		}
		
		return score;
	}

}*/
package com.check_password;
//import java.io.*;
import java.util.*;
public class CheckPassword {
   
   
    public static String printStrongNess(String input)
    {
        // Checking lower alphabet in string
        int n = input.length();
        boolean hasLower = false, hasUpper = false,
                hasDigit = false, specialChar = false;
        Set<Character> set = new HashSet<Character>(
            Arrays.asList('!', '@', '#', '$', '%', '^', '&',
                          '*', '(', ')', '-', '+'));
        for (char i : input.toCharArray())
        {
            if (Character.isLowerCase(i))
                hasLower = true;
            if (Character.isUpperCase(i))
                hasUpper = true;
            if (Character.isDigit(i))
                hasDigit = true;
            if (set.contains(i))
                specialChar = true;
        }
       
        // Strength of password
        System.out.print("Strength of password:- ");
        if (hasDigit && hasLower && hasUpper && specialChar
            && (n >= 8))
            System.out.print(" Strong");
        else if ((hasLower || hasUpper || specialChar)
                 && (n >= 6))
            System.out.print(" Medium");
        else
            System.out.print(" Weak");
        return input;
       
    }
    
 
    // Driver Code
    public static void main(String[] args)
    {
    	System.out.println("\nPassword Strength Checker ");
    	   System.out.println("Enter the password: ");
    	   Scanner sc = new Scanner(System.in);
    	   String password = sc.nextLine();
    	   printStrongNess(password);
    }
 
     
}

