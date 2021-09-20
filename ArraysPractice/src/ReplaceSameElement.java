import java.util.Arrays;

public class ReplaceSameElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,3,3,4,4,5};
		Arrays.sort(a);
		int in=1;
		int last=a[a.length-1];
		for(int i=0;i<a.length-1;i++)
		{
//			for(int j=(i-1);j>=0;j--)
//			{
//				if(a[i]==a[j])
//				{					
//					a[i]=last+in;
//					in++;
//				}
//			}
			if(a[i]==a[i+1])
			{
				a[i]=last+in;
				in++;
			}
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
