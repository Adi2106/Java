package RegEq;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailVerification 
{
	public static boolean isValid(String email)
	{		
		Pattern p = Pattern.compile("[a-z0-9]*@[a-z]+([.][a-z]+)$");
		Matcher m = p.matcher(email);
		return m.matches();
	}
	
	public static void main(String[] args) 
	{
		EmailVerification mn = new EmailVerification();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Email Id");
		String email = sc.nextLine();
		if(isValid(email)==true)
			System.out.println("Email Id Validated!");
		else
			System.out.println("Email Id Not Validated!");			
	}
}
