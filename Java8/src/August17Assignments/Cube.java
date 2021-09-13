package August17Assignments;

import java.util.function.IntFunction;

public class Cube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		IntFunction f = (n) -> n*n*n;
		System.out.print(f.apply(2));
	}

}
