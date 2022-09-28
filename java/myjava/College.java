package myjava;

import java.util.Scanner;

public class College {

	Teacher teaching()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Student name: ");
		String name = sc.nextLine();
		System.out.println("Enter which course you want to take: ");
		String course = sc.nextLine();
	    sc.close();
	    System.out.println("'" + name.toUpperCase() + "'" + " want " + "'" + course.toUpperCase() + "'" + " course.");
		if (course.equalsIgnoreCase("java"))
		{
			return new JavaTeacher();
		}
		
		else if (course.equalsIgnoreCase("python"))
		{
			return new PythonTeacher();
		}
		
		else if (course.equalsIgnoreCase("sql"))
		{
			return new SqlTeacher();
		}
		System.out.println("Sorry " + "'" +course.toUpperCase() + "'" + " course is not available now.");
		return null;
		
	}
}
