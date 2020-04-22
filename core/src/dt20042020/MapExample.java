package dt20042020;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

HashMap<Integer, String> map = new HashMap<Integer, String>();

map.put(1010, "raj");
map.put(1000, "bhanu");
map.put(900, "aravind");
map.put(3020, "ramesh");
map.put(2020, "upendra");
map.put(2030, "Hemanth");

System.out.println(map);


Set<Map.Entry<Integer, String>> entry =map.entrySet();

Iterator<Map.Entry<Integer, String>>  itr =entry.iterator();

while(itr.hasNext())
{
	Map.Entry<Integer, String> entr = itr.next();
	
	if(entr.getValue().equals("raj"))
	{
		entr.setValue("Rajesh");
	}
	System.out.println(entr.getKey()+" :"+entr.getValue());
}

System.out.println(map);

	}

}
