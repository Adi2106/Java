
import java.io.*;
public class VowelsAndSC
{
	public boolean vowel(char ch)
	{
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		return true;
		return false;
	}
	public boolean specialChar(char ch)
	{
		if(ch=='$'||ch=='#'||ch=='@'||ch=='!'||ch=='&')
		return true;
		return false;
	}
    public static void main(String[] args)throws IOException
    {    	
    	VowelsAndSC ob = new VowelsAndSC();
        FileInputStream fstream = new FileInputStream("C:\\Users\\A\\Desktop\\ENFEC\\Enfec JAVA\\Test19thAugust\\src\\InputFile.txt");
        DataInputStream in = new DataInputStream(fstream);
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        FileWriter ostream = new FileWriter("C:\\Users\\A\\Desktop\\ENFEC\\Enfec JAVA\\Test19thAugust\\src\\OutputFile.txt");
        BufferedWriter out = new BufferedWriter(ostream);
        String str=br.readLine();        
         char ch;
         int l=str.length();
         for (int i=0;i<l;i++)
         {
          ch = str.charAt(i);
          if(ob.vowel(ch)==true || ob.specialChar(ch)==true)
              {
              out.write(ch);      
              }
          }
         out.close();
         System.out.println("Sucessfully written");
          br.close();         
    }
}
