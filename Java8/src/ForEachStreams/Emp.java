package ForEachStreams;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;

public class Emp {

	String ename;
	int eId;
	static int eSal;
	Emp(String ename, int eId, int eSal)
	{
		this.ename = ename;
		this.eId = eId;
		this.eSal = eSal;		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp e1 = new Emp("A" , 1 , 10000);
		Emp e2 = new Emp("B" , 2 , 20000);
		Emp e3 = new Emp("C" , 3 , 30000);
		Emp e4 = new Emp("D" , 4 , 40000);
		Emp e5 = new Emp("E" , 5 , 50000);
		List<Integer> l = Arrays.asList(10000, 20000, 30000, 40000, 50000);					
		l.stream().map(sal-> sal +1000).forEach(System.out::println);
		
	}
}
