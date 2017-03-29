package com.test.stringassignment;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.apache.commons.lang3.StringUtils;
/**
 * 
 * @author Divya
 * This Program transforms any given String to following pattern using apachecommonLang StringUtils.
 * I.E. printer => p5r ; visa => v2a ; function => f6n.
 */
public class UsingCommonLangStrUtils {
	
	public static void main(String[] args) throws IOException {
        
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Input String to be changed:");    
		String input = br.readLine();	
		System.out.println("The Input String is:"+input);
		int length =input.length();// Gives the size of input string
		
		if(length>=3){
        String firstChar =StringUtils.substring(input,0,1);// Returns first character of the input string
        String lastChar = StringUtils.substring(input,length-1,length);// Returns last character of the input string
     
        Object[] ob = new Object[]{firstChar, length-2, lastChar};
        String output= StringUtils.join(ob, ""); /* Joins the elements of the provided array 
        into a single String containing the provided list of elements*/
        
        System.out.println("Required Output String is:"+output);
		}
		else
		{
			System.out.println("Please Enter String length greater than 3");
		}		
	}       
}
