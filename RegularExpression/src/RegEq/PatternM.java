package RegEq;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p = Pattern.compile("abc");
		Matcher m = p.matcher("abcfgdgwerertfdfdsabcrt");
		int c=0;
		while(m.find())
		{
			System.out.println("Starting index "+m.start() + " Ending Index " + (m.end()-1));
			c++;
		}
		System.out.println("Number Of Occurences " + c); 
	}
}
