package ForEachStreams;

import java.util.ArrayList;

public class TestForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		al.forEach(a->{
			if(a%2==0 && a%3==0)
			System.out.println(a);
		});
		al.forEach(System.out::println);//Method Reference
	}

}
