package dt16042020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {

  List<Integer> list = new ArrayList<Integer>();
  
  list.add(30);
  list.add(10);
  list.add(20);
  list.add(40);
  list.add(23);
  list.add(47);
  
  Stream<Integer> stream=list.stream();
  stream.sorted(Collections.reverseOrder()).forEach(t->System.out.println(t));
  System.out.println("Evens");
  list.stream()
  .filter(t-> t%2==0)
  .sorted(Collections.reverseOrder())
  .forEach(t->System.out.println(t));;

  
  
  
		

	}

}
