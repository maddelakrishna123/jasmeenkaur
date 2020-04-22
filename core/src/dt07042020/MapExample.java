package dt07042020;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class MapExample {

	public static void main(String[] args) {


		/*
		 *  101=krishna  //entry
		 *  
		 *  keys and values are Objects
		 *  keys can not be duplicated
		 *  but value can be
		 *  
		 *  set of entries
		 *  
		 *   Properties
		 *   
		 *    Hashtable
		 *    
		 *    Map - java.util,
		 *    HashMap is implemented class
		 *    LinkedHashMap
		 *    TreeMap - ordered map
		 */

		
		Map<Integer, String>  map = new HashMap<Integer, String>();
		
		// Add 
		
		map.put(101, "abc"); //
		map.put(102, "pqr");
		map.put(103, "str");
		map.put(101, "sqr");
		map.put(104, "str");


		
		System.out.println(map);
		
		// Retriving
		
		System.out.println(map.get(101));
		
		// searching
		
		  // containsKey(Object key) - boolean 
		
		 // containsValue(Object value) - boolean
		
		// Deleting
		


		//map.remove(101,"abc");
		//System.out.println(map);
		
		//map.isEmpty()
		
		//map.size();
		
		// Collection View map
		
		Set<Integer> keys = map.keySet();
		System.out.println(keys);
		
		Collection<String> vals =map.values();
		System.out.println(vals);
		
		
		
		 Set<Map.Entry<Integer, String>> entries = map.entrySet();
		 
		Iterator<Map.Entry<Integer, String>> itr = entries.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry<Integer, String> entry =itr.next();

if(entry.getValue().equals("str"))
{
	entry.setValue("krishna");
}
			System.out.println(entry.getKey() + ": "+entry.getValue());
		}
		
		
		
	}

}