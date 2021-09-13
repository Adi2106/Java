package ForEachStreams;

import java.util.stream.Stream;

public class StreamsEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Three ways of creating a stream 
		/*First Way
		 * By defing a stream of fixed length*/
		Stream<Integer> s = Stream.of(1,2,3,4,5,6,7,8,9);
		s.forEach(p->System.out.println(p*10));
		
		Stream<String> str = Stream.of("aditya","pinki","tarun","null");
		str.forEach(p->System.out.println(p.toUpperCase()));
		
	}

} 
