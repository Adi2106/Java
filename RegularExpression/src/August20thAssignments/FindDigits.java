package August20thAssignments;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		char ch[] = s.toCharArray();		
		if(s.matches("[0-9a-zA-Z!@#$%^&]*"))
		{
			System.out.println("The Digits are");
			for(char c : ch)
			{				
				if(Character.isDigit(c)==true)
				{
					System.out.println(c);
				}				
				else
					continue;
			}		
		}
		else
			System.out.println("Incorrect Input");
	}	
}
