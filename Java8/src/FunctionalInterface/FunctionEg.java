package FunctionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;
/*
 * Function<Type Parameter, Return parameter*/
public class FunctionEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<Integer, Integer> f = (x) -> x+20;
		System.out.println(f.apply(20));
		Function<Integer, Double> f1 = (x) -> x+20.0;
		System.out.println(f1.apply(20));
		Function<String, Integer> f2 = (str) -> str.length();
		System.out.println(f2.apply("Aditya Mukherjee"));
	
	
//	   Function Chaining
		Function<Integer, Integer> f3 = (x) -> 2*x;
		Function<Integer, Integer> f4 = (x) -> x*x*x;
//		AND THEN FUNCTION
		System.out.println("And Then Output "+f3.andThen(f4).apply(2));
//		COMPOSE FUNCTION
		System.out.println("Compose Output "+f3.compose(f4).apply(2));
//	BIFUNCTION
		BiFunction<Integer, Integer, Integer> bf = (x,y) -> x+y;
		System.out.println(bf.apply(20, 30));
	
	}

}
