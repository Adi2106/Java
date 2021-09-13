package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class ArrayListSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(56);
		al.add(67);
		al.add(90);
		al.add(87);
		al.add(23);
		al.add(55);
		al.add(38);
		System.out.println("ArrayList Befor Sorting : " + al);
		Comparator<Integer> c = (n1,n2) -> (n1>n2)?-1:(n1<n2)?1:0;
		Collections.sort(al);
		System.out.println("ArrayList after Sorting : " + al);
		LinkedList<Integer> l = new LinkedList<Integer>(al);
		System.out.println("LinkedList after Sorting : " + l);
	}

}
