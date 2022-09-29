package array;

public class Student {

	String name;
	int Id;
	String college;
	String course;
	
	Student(String name, int Id, String college, String course)
	{
		this.college = college;
		this.course = course;
		this.Id = Id;
		this.name = name;
	}
	
    @Override
	public String toString() {
		return "Student [name=" + name + ", Id=" + Id + ", college=" + college + ", course=" + course + "]";
	}
}
