package com.test.stringassignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import org.springframework.util.StringUtils;


/**
 * 
 * @author Divya
 * This Program transforms any given String to following pattern using SpringFramework StringUtils.
 * I.E. printer => p5r ; visa => v2a ; function => f6n.
 */
public class UsingSpringStrUtils {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Input String to be changed:");    
		String input = br.readLine();	
		System.out.println("The Input String is:"+input);
		int length =input.length();// Gives the size of input string
		
		Object[] requiredTokens = new Object[3];
		
		if(length>=3){	
		 requiredTokens[0] = input.charAt(0); // Adds the fist character in string to Object array
		 requiredTokens[1] = length-2; // Length of String reduced by 2
		 requiredTokens[2] = input.charAt(length-1);// Adds the last character in string to Object array
		 String output=  StringUtils.arrayToDelimitedString(requiredTokens,""); //Convert an Object array into a delimited String      	 
		 System.out.println("Required Output String is:"+output);
		 }
		else
		{
			System.out.println("Please Enter String length greater than 3");
		}		
		 
}

}
