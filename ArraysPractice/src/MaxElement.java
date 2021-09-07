import java.util.Scanner;

public class MaxElement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter Size");
		int s=sc.nextInt();
		int a[] = new int[s];
		for(int i=0;i<s;i++)
		{
			a[i]=sc.nextInt();
		}
		int max = a[0];
		int min = a[0];
		for(int i=1;i<s;i++)
		{
			if(max<a[i])
				max=a[i];
			if(min>a[i])
				min=a[i];
		}
		System.out.println("Maximum "+max);
		System.out.println("Minimum "+min);
	}

}
