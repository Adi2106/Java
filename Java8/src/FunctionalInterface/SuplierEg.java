package FunctionalInterface;

import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class SuplierEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String> s = ()-> {
			String str = "Aditya" + " Mukherjee";
			return str;
		};
		System.out.println(s.get());
		Supplier<Integer> s1 = ()-> {
			int x = 10;
			int y = 20;
			return x+y;
		};
		System.out.println(s1.get());
		IntSupplier is = ()->{
			int n=5;
			return n*n;
		};
		System.out.println(is.getAsInt());
	}

}
