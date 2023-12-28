package ourpractice;

import java.util.Scanner;

class Switch_Case {
	
	public static void main(String arg[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter one letter of fruits: ");
	String name = sc.nextLine();
	sc.close();
	
	switch(name.toUpperCase())
	{
	case "A":
	System.out.println("It is an Apple: ");
	break;
	
	case "B":
	System.out.println("It is a Banana: ");	
	break;
	
	case "C":
	System.out.println("It is a Cherry: ");	
	break;
	
	default:
	System.out.println("Write the correct letter: ");
	}
	
}
}
