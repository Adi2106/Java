package August20thAssignments;


import java.io.*;
public class ReadandWrite
{
	public boolean specialChar(char ch)
	{
		if(ch=='$'||ch=='#'||ch=='@'||ch=='!'||ch=='&')
		return true;
		return false;
	}
	
    public static void main(String[] args)throws IOException
    {    	
    	ReadandWrite ob = new ReadandWrite();
        FileInputStream fstream = new FileInputStream("C:\\Users\\A\\Desktop\\ENFEC\\Enfec JAVA\\RegularExpression\\src\\August20thAssignments\\Read.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        FileWriter ostream = new FileWriter("C:\\Users\\A\\Desktop\\ENFEC\\Enfec JAVA\\RegularExpression\\src\\August20thAssignments\\Write.txt");
        BufferedWriter out = new BufferedWriter(ostream);
        String str=br.readLine();                 
         int l=str.length();
         char ch[] = str.toCharArray();		
         int count=0;
 		if(str.matches("[0-9a-zA-Z!@#$%^&]*"))
 		{ 			
 			for(char c : ch)
 			{				
 				if(Character.isDigit(c)==true || ob.specialChar(c)==true)
 				{
 					count++;
 					out.write(c + " " + "\n");
 				}				
 				else
 					continue;
 			}		
 			out.write("The number of digits and special characters in the given string are "+count);
 		}
 		else
 			System.out.println("Incorrect Input");
         out.close();
         System.out.println("Sucessfully written");
          br.close();         
    }
}
