package OptionalClass;

import java.util.Optional;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = null;
		String strr = "Hello World";
		Optional<String> o =  Optional.ofNullable(str);
		if(o.isEmpty())
		System.out.println("Empty String");
		else
			System.out.println("Not Empty");
		Optional<String> o1 =  Optional.ofNullable(strr);
		if(o1.isPresent())
		System.out.println("Not Empty String " + strr);
		else
			System.out.println("Empty");
	}

}
