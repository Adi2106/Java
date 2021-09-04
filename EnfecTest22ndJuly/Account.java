package Test22ndJuly;
import java.util.Scanner;
public class Account 
{
    double amt;
    double balance = 0;
    Account(double amt)
    {
        this.amt = amt;
    }
    public void deposit(double amt)
    {
        try
        {
            if(amt<0)
                throw new InvalidAmountException("The Amount Is Invalid");
            else
                System.out.println("Successfully Deposited the amount");
                balance = balance + amt;
                System.out.println("The Balance is " + balance);
        }
        catch(InvalidAmountException ie)
        {
            System.out.println(ie);
        }
        
    }
    public void withdrawal(double amt)
    {
        try
        {
            if(balance<500)
                throw new LowBalanceException("Low Balance");
            else
            {
                balance = balance - amt;
                System.out.println("The Balance After Withdrawing is " + balance);
            }
        }
        catch(LowBalanceException lb)
        {
            System.out.println(lb);
        }                
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Amount");
        double amt = sc.nextDouble();
        Account a = new Account(amt);
        System.out.println("Do you want to Deposit Or Withdraw ?? ");
        String ch = sc.next();
        if(ch.equalsIgnoreCase("deposit"))
            a.deposit(amt);
        else
            a.withdrawal(amt);
    }
}
