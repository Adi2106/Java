package EmployeeManagement;

import java.time.LocalTime;
import java.util.Scanner;
import java.util.regex.Pattern;

public class HomePage implements Runnable {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome !!");
		System.out.println("Do you want to Register Or Login?");
		String s = sc.nextLine();
		if(s.equalsIgnoreCase("login"))
		{		
			System.out.println("Enter Your Details");
			System.out.println("Name");
			String nm = sc.nextLine();		
			System.out.println("Employee Id");
			String id = sc.next();
			Login oldEmployee = new Login(nm,id);
			oldEmployee.display();
			Thread t1 = new Thread();
			t1.start();
			Task t = new Task();
			t.displayTask();
		}
		else
		{
			System.out.println("Enter Your Name");
			String name = sc.nextLine();			
			System.out.println("Enter Your Age");
			int age = sc.nextInt();
			Register newEmployee = new Register(name,age);
			newEmployee.display();
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
