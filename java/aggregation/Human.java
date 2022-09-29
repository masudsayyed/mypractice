package aggregation;

public class Human {

	Name Name;
	String Gender;
	int age;
	
	public Human(Name Name, int age, String Gender )
	{
		this.Name = Name;
		this.Gender = Gender;
		this.age =age;
	}

	@Override
	public String toString() {
		return Name + " \n" + "Gender: " + Gender + ".\n" + "age: " + age + ".";
	}
	
	/*void display()
	{
		System.out.println(Name);
		System.out.println(Gender);
		System.out.println(age);
	}*/
	
}
