package dt31032020;

import dt01042020.Address;

public  class Person {
	
	protected String name;
	protected  String email;
	protected  String mobile;
	protected int m = 10;
	
	//final int x = 40; //  constant  
	
	// final - class, methods,variables
	
	// Single, Multilevel, Hibrid, multiple
//

public Person()
{
	
}
// super(), super keyword

	public Person(String name, String email, String mobile) {
		super();
		this.name = name;
		this.email = email;
		this.mobile = mobile;
		
		//x = x + 10;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	
	// Constructor
	
	
	
	
	// getters and setters
	
	
	public String getStudentAddress(Address a)
	{
		return a.getCity();
	}
	//
	
	public  void displayData()
	{
		System.out.println(name +" "+email +" "+mobile);
	}

}
