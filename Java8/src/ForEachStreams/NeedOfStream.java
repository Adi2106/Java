package ForEachStreams;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NeedOfStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x[] = {10,20,30,40,50};
		Stream<Integer> s = Stream.of(x);
		List<Integer> li = s.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(li);
				
		List<Integer> l = Arrays.asList(x);
		List<Integer> ll = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(ll);
		
		
	}

}
