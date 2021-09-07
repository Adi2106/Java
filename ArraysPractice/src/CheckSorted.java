import java.util.Scanner;

public class CheckSorted
{
	public static boolean checkSorted(int[] a, int n)
	{
		boolean check=true;
		
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]>a[j])
				{
					check=false;
					break;
				}				
			}
		}
		return check;
	}

	public static boolean checkSorted2(int[] a, int n)
	{
		boolean check=true;
		
		for(int i=1;i<n;i++)
		{
			if(a[i]<a[i-1])
			{
				check=false;
				break;
			}
		}
		return check;
	}
	public static void main(String[] args) 
	{		
		CheckSorted cs = new CheckSorted();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Size");
		int s=sc.nextInt();
		int a[] = new int[s];
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Is it Sorted?  Method 1  "+	cs.checkSorted(a,s));
		System.out.println("Is it Sorted?  Method 2  "+	cs.checkSorted2(a,s));
		
	}

}
