package FunctionalInterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> c = (str) -> System.out.println(str);
		c.accept("Aditya");
		c.accept("Mukherjee");
		Consumer<String> c1 = (str) -> System.out.println(str);
		c.andThen(c1).accept("Hello");
//		BICONSUMER
		BiConsumer<Integer, Integer> bc = (n1,n2) -> {
			System.out.println(n1 + n2);
		};
		BiConsumer<Integer, Integer> bcc = (n1,n2) -> {
			System.out.println(n1 + n2);
		};
		bc.accept(50, 30);
		bcc.andThen(bc).accept(50, 80);
	}

}
