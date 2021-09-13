package FunctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UnaryOperator<Integer> u = UnaryOperator.identity();
		u.apply(10);
	}

}
