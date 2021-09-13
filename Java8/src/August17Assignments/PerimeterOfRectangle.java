package August17Assignments;

import java.util.function.BiFunction;

public class PerimeterOfRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> bf = (l,b) ->2*(l+b); 
		System.out.println("Perimeter Of Rectangle "+bf.apply(2, 4));
	}

}
