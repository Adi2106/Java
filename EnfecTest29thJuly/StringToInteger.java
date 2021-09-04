package Test29thJuly;
import java.util.Scanner;
public class StringToInteger {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        char ch[] = s.toCharArray();
        /** Taking A=1  as well as a=1*/
        System.out.println("The Converted Integer Value is");
        for (char c : ch)
        {
            int d;
            if(c>='a' && c<='z')
            {
                d = (int)c - 96;
            }
            else if(c>='A' && c<='Z')
            {
                d=(int)c - 64;
            }
            else
            d = (int)c-48; 
            System.out.print(d + " ");
        }  
        
    }
}