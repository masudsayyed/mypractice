package myjava;

public class Teacher_Main {

	public static void main(String args[])
	{
		Teacher t = new College().teaching();
		
		Student s = new Student();
	
		if(t != null)
		{
			s.student(t);
		}
		
		else
		{
			System.out.println();
		}
		
		
	}
}
