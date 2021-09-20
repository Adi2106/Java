package Details;

import java.util.Scanner;

public class BankBalance 
{
	public static int balance=10000;
	public int withdraw(int bal)
	{
		return balance-bal;
	}
	public int deposit(int bal)
	{
		return balance+bal;
	}
	public static void main(String[] args) 
	{
		BankBalance b= new BankBalance();
		Scanner sc = new Scanner(System.in);
		System.out.println("Your current Balance is: "+ balance);
		System.out.println("What do you want to do? \n1.Deposit\n2.Withdraw ");
		String ch=sc.next();
		if(ch.equalsIgnoreCase("1"))
		{
			System.out.println("Enter the amount to be deposited.");
			int amt=sc.nextInt();						
			System.out.println("Amount Deposited Successfully \nUpdate Balance: "+b.deposit(amt));
			balance=b.deposit(amt);
		}
		else if(ch.equalsIgnoreCase("2"))
		{
			System.out.println("Enter the amount to be Withdrawn.");
			int amt=sc.nextInt();						
			System.out.println("Amount Withdrawn Successfully \nUpdate Balance: "+b.withdraw(amt));
			balance=b.withdraw(amt);
		}
	}
}
