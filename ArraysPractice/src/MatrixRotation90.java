import java.util.Scanner;

public class MatrixRotation90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("Enter Size");
		int s=sc.nextInt();
		int a[][] = new int[s][s];
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{				
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{				
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
		for(int i=0;i<s/2;i++)
		{
			for(int j=i;j<s-1;j++)
			{				
				int temp=a[i][j];
				a[i][j]=a[s-1-j][i];
				a[s-1-j][i]=a[s-1-i][s-1-j];
				a[s-1-i][s-1-j]=a[j][s-1-i];
				a[j][s-1-i]=temp;
			}
		}
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{				
				System.out.print(a[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
