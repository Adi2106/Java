package August20thAssignments;

import java.util.Scanner;

public class EndingWithb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = sc.nextLine();
		if(s.matches("[0-9a-zA-Z!@#$%^&]*b$"))
			System.out.println("Correct");
		else
			System.out.println("Incorrect");
	}

}
