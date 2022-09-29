package aggregation;

import java.util.Scanner;

public class MainHuman {

	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your First name: ");
		String FName = sc.nextLine();
		
		System.out.println("Enter your Last name: ");
		String LName = sc.nextLine();
		
		System.out.println("Enter your Gender: ");
		String gender = sc.nextLine();
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		
		sc.close();
		
		Name n1 = new Name(FName.toUpperCase(), LName.toUpperCase());
		
		Human h = new Human(n1, age, gender.toUpperCase());
		
		System.out.println("Info of human:- " + "\n"+h);
	}
}
