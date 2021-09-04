import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class IntersectionOfArrays 
{
	
	 static void printIntersection(int arr1[], int arr2[])
	    {
	        HashSet<Integer> hs = new HashSet<>();
	        HashSet<Integer> hs1 = new HashSet<>();
	 
	        for (int i = 0; i < arr1.length; i++)
	            hs.add(arr1[i]);
	 
	        for (int i = 0; i < arr2.length; i++)
	            if (hs.contains(arr2[i]))
	                System.out.print(arr2[i] + " ");
	    }

	public static void main(String[] args) 
	{		
		IntersectionOfArrays iOA = new IntersectionOfArrays();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length of Array 1");
		int n1 = sc.nextInt();
		int a1[] = new int[n1];
		System.out.println("Enter elements of Array 1");
		for(int i=0;i<n1;i++)
		{
			a1[i] = sc.nextInt();
		}
		System.out.println("Enter length of Array 2");
		int n2 = sc.nextInt();
		int a2[] = new int[n2];
		System.out.println("Enter elements of Array 2");
		for(int i=0;i<n2;i++)
		{
			a2[i] = sc.nextInt();
		}			
		Arrays.sort(a1);
		System.out.print("The Sorted First Array 1 is --->");
		for(int i=0; i<n1;i++)
		{
			System.out.print(a1[i] + " ");
		}
		System.out.println();
		Arrays.sort(a2);
		System.out.print("The Sorted First Array 2 is --->");
		for(int i=0; i<n2;i++)
		{
			System.out.print(a2[i] + " ");
		}
		
		System.out.println();
		System.out.println();
		System.out.println("The Intersection of the two Arrays are");
			
		iOA.printIntersection(a1, a2);
		
		
	}

}
