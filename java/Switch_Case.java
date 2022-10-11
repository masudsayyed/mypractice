package ourpractice;

import java.util.Scanner;

class Switch_Case {
	
	public static void main(String arg[]) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter one letter of gaali: ");
	String name = sc.nextLine();
	sc.close();
	
	switch(name.toUpperCase())
	{
	case "C":
	System.out.println("Chinal hai tu: ");
	break;
	
	case "G":
	System.out.println("Gandu hai tu: ");	
	break;
	
	case "M":
	System.out.println("Madarchod hai tu: ");	
	break;
	
	default:
	System.out.println("Bhadwe: ");
	}
	
}
}