package dt16042020;

import java.io.Serializable;

public class Employee implements Comparable<Employee>,Serializable {
	
	private int eid;
	private String name;
	public Employee(int eid, String name) {
		super();
		this.eid = eid;
		this.name = name;
	}
	public int getId() {
		return eid;
	}
	public void setId(int id) {
		this.eid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + eid + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Employee o) {
		if(this.eid > o.eid)
		return 1;
		else if(this.eid < o.eid)
			return -1;
		else
		return 0;
	}
	
	

}
