package dt31032020;

public abstract class Bank {

// concrete method
	public void withdraw()
	{
		System.out.println("Withdraw is called");
	}
	
	public abstract int getRateOfIntrest();
	
}

// 2 i hided 1 not hided  50 % 
// AB with o ab  0%
//AB class o concrete method 

// 0- 100 %

// HDFC, ICICI

// Abstract classes can not be instantiated

//  Bank b = new Bank();

// to define other classes with same abstract

// 100 % interfaces - special class which ab methods and final variables