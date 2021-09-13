package FunctionalInterface;

import java.util.function.BiPredicate;
import java.util.function.DoublePredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredicateEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p = (Integer n) -> (n%2==0);		
		System.out.println(p.test(10));
//		System.out.println(p.negate());
		Predicate<Integer> p1 = (Integer n) -> n%3==0;
		System.out.println(p1.test(10));
//		Using and 
		if(p.and(p1).test(6))
			System.out.println("Both Correct");
		else
			System.out.println("Incorrect");
		if(p.or(p1).test(10))
			System.out.println("Correct");
		else
			System.out.println("Both InCorrect");
		
		BiPredicate<Integer, Integer> bp = (a,b) -> a>b;
		System.out.println(bp.test(10,20));
		IntPredicate pp = (n) -> {
			if(n>200)
				return true;
			else
				return false;
		};
		System.out.println("IntPredicate "+ pp.test(500));
		DoublePredicate dp = (n) -> {
			if(n>200.0)
				return true;
			else
				return false;
		};
		System.out.println("DoublePredicate "+ pp.test(500));
		
	}

}
