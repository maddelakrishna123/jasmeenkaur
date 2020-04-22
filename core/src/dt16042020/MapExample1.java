package dt16042020;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample1 {

	public static void main(String[] args) {
		/*
		 * Map<Integer, String> map = new TreeMap<Integer,
		 * String>(Collections.reverseOrder()); map.put(201, "rajesh"); map.put(101,
		 * "Anand"); map.put(401, "Bhupal"); map.put(301, "Drupesh");
		 * 
		 * 
		 * 
		 * System.out.println(map);
		 */

		
		
		
		 Map<Employee, Integer> map = new TreeMap<Employee, Integer>(Collections.reverseOrder());
		 
		 
		 Employee e1 = new Employee(201, "Venkat");
		 Employee e2 = new Employee(101, "Krishna");
		 Employee e3 = new Employee(401, "Viswa");
		 Employee e4 = new Employee(501, "Anand");
		 
		 map.put(e4,5);
		 map.put(e1,2);
		 map.put(e3,4);
		 map.put(e2,5);
		 
		 System.out.println(map);
		 map.entrySet().stream().sorted(Map.Entry.comparingByValue(Collections.reverseOrder())).forEach(t->System.out.println(t));
		
	}

}
