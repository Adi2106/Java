

import java.util.Scanner;
import java.util.regex.*;
class Password {

	public static boolean isValidPassword(String password)
	{
		Pattern p = Pattern.compile("(.*[a-zA-Z0-9]?)" + "(.*[@#$%^&+=]?)" + "(.\\S+$?).{8,20}$");	
		Matcher m = p.matcher(password);
		return m.matches();
	}	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter Your Password");
		String str1 = sc.nextLine();
		if(isValidPassword(str1)==true)
		System.out.println("Pasword is Accepted");
		else
			System.out.println("Password Is Not Accepted");
	}

}