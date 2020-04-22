package dt31032020;

public class InterfaceDemo {

	public static void main(String[] args) {


		EmployeeServices es = new EMployeeServicesImpl();
		
		es.createEmployee();
		// anonymous inner class
		
		EmployeeServices es1 = new EmployeeServices() {

			@Override
			public void createEmployee() {

 
				
			}
			
			
		};
		
es1.createEmployee();
		
		EmployeeServices es2 =()->{ System.out.println("Lambda Expression");};
		
		es2.createEmployee();
		
		
	}

}
