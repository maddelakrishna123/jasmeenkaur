package dt31032020;

import dt01042020.Address;
import dt01042020.Employee;

public class Demo {

	public static void main(String[] args) {

   Address a = new Address();
   a.setCity("newyark");
		
		
		Employee e = new Employee(1,"","",a); // 
		e.setAddress(a);
		// id, name, address
		System.out.println(e.getAddress());
		System.out.println(e.getAddress().getCity().toUpperCase());
	}

}
