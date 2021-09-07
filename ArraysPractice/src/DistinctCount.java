import java.util.Scanner;

public class DistinctCount 
{
	
	public static int countDigits(int[] a, int n)
	{
		int count=0; boolean isDigit=true;
		
		for(int i=0;i<n;i++)
		{
			for(int j=(i-1);j>=0;j--)
			{
				if(a[i]==a[j])
				{
					isDigit=false;
					break;
				}
			}
			if(isDigit==true)
				count++;
			isDigit=true;
		}			
		return count;
	}
	
	
	public static void main(String[] args) 
	{		
		DistinctCount dc = new DistinctCount();
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter Size");
		int s=sc.nextInt();
		int a[] = new int[s];
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println(dc.countDigits(a,s));
		
	}

}
