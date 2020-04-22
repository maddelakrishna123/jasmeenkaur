package core;

public class Product {

	// you emais in your gmail
	
	private int id;  // instance variable
	private String name;
	private double price;
	
   private static int disc;  // class variable

	
	public int getId()
	{
		return id;
	}
	
	// modifying
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	@Override
	public String toString()
	{
		return id+""+name +" "+price ;
	}
	
	@Override
	public int hashCode()
	{
		return id;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		// if this and obj is same id
		
		if(obj!=null && obj instanceof Product)
		{
			Product p = (Product)obj;
			
			return this.id == p.id;
		}
		
		return false;
	}
	
}
