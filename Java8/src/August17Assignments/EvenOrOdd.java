package August17Assignments;

import java.util.Scanner;
import java.util.function.IntPredicate;

public class EvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		IntPredicate ip = (num) -> num%2==0;
		if(ip.test(n)==true)
			System.out.println("Number is Even");
		else
			System.out.println("Number is Odd");
		
	}

}
