package dt01042020;
// E - E,C-C , I -I
public class Customer implements Comparable<Customer> {
	private int id;
	private String name;
	
	public Customer(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + "]";
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Customer o) {

         // Student1 Student2 
		  //  12 10   - +ve
		 //  10 12  -  -VE
		  // 12 12  - 0
		
		if(this.id > o.id)
		{
			return 1;
		}else if(this.id < o.id)
		{
			return -1;
		}else
		{
		return 0;
		}
	}
	
	 
}
