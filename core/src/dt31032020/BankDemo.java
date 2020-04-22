package dt31032020;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

// hide 
		 Bank b;
		
		 // Dao
		 
		
		 System.out.println("Enter Class Name");
		 Scanner sc = new Scanner(System.in);
		 String className= sc.next();
		 
		Object o = Class.forName(className).newInstance();
		 
		 b = (Bank) o;
		int res = b.getRateOfIntrest();
		System.out.println(res);
		 
	}

}

// dt31032020.HDFCBank