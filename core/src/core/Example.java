package core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Example {
	
	
	public static void main(String[] args) {
	
		List<Integer> l = new ArrayList<Integer>();
		l.add(2);

		l.add(3);

		l.add(1);
	
		Collections.sort(l);
		System.out.println(l);
		Product p = new Product();  //default constructor
		p.setId(1);
		
		
		Product p1 = new Product();
	p1.setId(2);
		
	String s = new String("abc");
		System.out.println(p);  // toString object
		System.out.println(p1);
		System.out.println(p.equals(p1)); // false
		
		System.out.println(p.hashCode());
		System.out.println(p1.hashCode());
		
	}

}
