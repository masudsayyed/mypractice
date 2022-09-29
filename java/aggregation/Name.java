package aggregation;

public class Name {
	
	String First_name;
	String Last_name;
	
	Name(String First_name, String Last_name)
	{
		this.First_name = First_name;
		this.Last_name = Last_name;
	}
	
	@Override
	public String toString()
	{
		return "Name: "+ First_name + " " + Last_name + ".";
	}

}
