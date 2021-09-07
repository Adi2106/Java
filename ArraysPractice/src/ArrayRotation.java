import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/*
 * 
 * Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 
 * Example:
Input:
2
5 2
1 2 3 4 5 
10 3
2 4 6 8 10 12 14 16 18 20

Output:
3 4 5 1 2
8 10 12 14 16 18 20 2 4 6

Explanation :
Testcase 1: 1 2 3 4 5  when rotated by 2 elements, it becomes 3 4 5 1 2.
 * */

public class ArrayRotation {

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
		System.out.println("Enter the index from where you want to rotate");
		int n = sc.nextInt();
		ArrayList al = new ArrayList();
		for(int i = n; i<a.length; i++)
		{
			al.add(a[i]);
		}
		for(int i=0; i<n; i++)
		{
			al.add(a[i]);
		}
		Iterator it = al.iterator();
		while(it.hasNext())
		{			
			System.out.print(it.next()+" ");
		}
			

	}

}
