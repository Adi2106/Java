import java.util.Scanner;

/*
 *  Given an array of size N and a sum, the task is to check whether some array elements can be added to sum to N . 
	Note: At least one element should be included to form the sum.(i.e. sum can't be zero) 
	EXAMPLE:
	Input: array = -1, 2, 4, 121, N = 5
	Output: YES
	The array elements 2, 4, -1 can be added to sum to N
	Input: array = 1, 3, 7, 121, N = 5	
	Output:NO 
 * */
public class SubsetSum 
{
	
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter Size");
		int s=sc.nextInt();
		int a[] = new int[s];
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();			
		}
		System.out.println("Enter the sum");
		int N = sc.nextInt();
		int sum=0;
		for(int i=0;i<s;i++)
		{
			sum+=a[i];
			if(sum==N)
				break;
		}
		if(sum==N)
			System.out.println("Yes");
		else
			System.out.println("No");
	}
}
