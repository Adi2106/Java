package Test22ndJuly;
import java.util.*;
public class RemoveDuplicates 
{
    static String remDupl(char ar[], int n)
	{		
		int index = 0;		
		for (int i = 0; i < n; i++)
		{			
			int j;
			for (j = 0; j < i; j++)
			{
				if (ar[i] == ar[j])
				{
					break;
				}
			}			
			if (j == i)
			{
				ar[index++] = ar[i];
			}
		}
		return String.valueOf(Arrays.copyOf(ar, index));
	}
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string ");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        int n = ch.length;
        System.out.println("String after removing duplicates");
        System.out.println(remDupl(ch, n));
        
    }
}
