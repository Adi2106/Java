import java.util.Arrays;

public class SecondHighest {

	public static void main(String[] args) 
	{		
		int a[] = {4,5,1,2,3,45,78,95,12,35,48,14,66};		
//		Arrays.sort(a);
//		System.out.println(a[a.length-2]);
		
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<a[i+1])
			{
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				i=-1;
			}
		}
//		for(int i=0;i<a.length;i++)
//		{
			System.out.println(a[1]);
//		}
	}

}

