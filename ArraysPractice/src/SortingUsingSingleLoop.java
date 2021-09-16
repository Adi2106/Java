
public class SortingUsingSingleLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {54,87,54,12,35,26,89,14,20,30,10,50,76};
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
		for(int i=0;i<a.length;i++)
		System.out.println(a[i]);
	}

}
