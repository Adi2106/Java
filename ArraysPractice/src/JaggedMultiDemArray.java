
public class JaggedMultiDemArray {

	public static void main(String[] args) 
	{
		int a[][] = new int[5][];
		for(int i=0; i <a.length; i++)
		{
			a[i] = new int[i+1];
			for(int j=0;j<a[i].length;j++)
			{
				a[i][j] = i;
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
//		Object aa = 'a';
//		System.out.println(aa);
		

	}

}
