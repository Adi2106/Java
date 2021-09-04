package EmployeeManagement;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Login {
	String nm;
	String id;
	Login(String nm, String id)
	{
		this.nm=nm;
		this.id=id;		
	}
	void display()
	{
		LocalTime lt = LocalTime.now();
		Pattern p =Pattern.compile("[0-9]{6}");
		if(p.matches("[0-9]{6}", id));
		{			
			System.out.println("Sucessfully Logged Inn!");
			System.out.println("At Time : " + lt);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
			
		System.out.println("Enter Your Details");
		System.out.println("Name");
		String nm = sc.nextLine();		
		System.out.println("Employee Id");
		String id = sc.next();
		Login l = new Login(nm,id);
		l.display();		
	}
}
