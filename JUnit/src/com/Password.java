package com;

import java.util.Scanner;
import java.util.regex.*;
public class Password {

	public static boolean isValidPassword(String password)
	{		
		Pattern p = Pattern.compile("(.*[a-zA-Z0-9]?)" + "(.*[@#$%^&+=]?)" + "(.\\S+$?).{6,}$");	
		Matcher m = p.matcher(password);
		return m.matches();
	}	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		Password p = new Password();		
		System.out.println(p.isValidPassword("asA@13s123"));				
	}
}
