package dt31032020;

import dt01042020.Address;

public class Student extends Person {  //3 + 2   // person is Super class 
	// IS-A Relation
	// student sub
	private int m = 30;
	private int id;
    private Address  address;  // HAS _ A relation // dependecy
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	private int marks;
         // Person();

	/*
	 * public Student(String name, String email, String mobile, int id, int marks) {
	 * super(name, email, mobile); this.id = id; this.marks = marks; }
	 */
	
	
	// Constructor
	
	
	
	
	// getters and setters
	
    @Override
	public void displayData()
	{
		
		System.out.println(id +marks+" "+super.m);
	}


}
