package August20thAssignments;

import java.util.Scanner;

public class UpperLower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		if(s.matches("[A-Z][a-z][A-Z]*[a-z]*?"))
			System.out.println("Correct");
		else
			System.out.println("Incorrect");
	}

}