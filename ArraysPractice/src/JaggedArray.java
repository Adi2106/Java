import java.util.Scanner;
public class JaggedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a[][] = new int[][] {
			
			new int[] {10,20,30},
			new int[] {10,20,30,40,50},
			new int[] {10,20}			
		};
		
		
		int ar[][] = new int[3][];
		ar[0] = new int[2];
		ar[1] = new int[3];		
		
		for(int i = 0; i<a.length; i++)
		{
			for(int j = 0; j < a[i].length; j++)
			{
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
