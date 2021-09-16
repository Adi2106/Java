import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class IntersectionOfArrays 
{
	public void printIntersection(int a[], int b[])
	{
		ArrayList<Integer> a1 = new ArrayList();
		ArrayList<Integer> a2 = new ArrayList();
		for(int i=0;i<a.length;i++)
			a1.add(a[i]);
		for(int i=0;i<b.length;i++)
			a2.add(b[i]);
		a1.retainAll(a2);
		System.out.println(a1);
		Iterator<Integer> i=a1.iterator();
		while(i.hasNext())
		{
			System.out.print(i.next()+" ");
		}
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
