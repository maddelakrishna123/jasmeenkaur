package dt22042020;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Writer;

import dt16042020.Employee;

public class SerialozationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {


		/*
		 * Employee emp = new Employee(); emp.setEid(101); emp.setName("Rakesh");
		 */
		
		

		
		// FileOutputStream fos = new FileOutputStream(new File("E:\\Online Trainings\\jasmeen kaur\\emp.txt"));
		 
		// fos.w
		 
		/*
		 * ObjectOutputStream oos = new ObjectOutputStream(fos);
		 * 
		 * oos.writeObject(emp); // seriazation
		 */	
		
		
		
		FileInputStream fis = new FileInputStream(new File("E:\\Online Trainings\\jasmeen kaur\\emp.txt"));
		
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Employee e = (Employee) ois.readObject();  // deserialization
		System.out.println(e);
		 
	}

}
