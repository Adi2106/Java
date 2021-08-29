package RegEq;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
public class MobileNumber {

	public static boolean isValidMobileNumber(String mobNum)
	{		
		Pattern p = Pattern.compile("(0|91)?(\\d){10}$");
		Matcher m = p.matcher(mobNum);
		return m.matches();
	}
	
	public static void main(String[] args) 
	{
		MobileNumber mn = new MobileNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter mobile number");
		String mobNum = sc.nextLine();
		if(isValidMobileNumber(mobNum)==true)
			System.out.println("Mobile Number Validated!");
		else
			System.out.println("Mobie Number Not Validated!");			
	}

}
