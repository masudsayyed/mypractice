package array;

public class MainStudent {
	public static void main(String args[])
	{
		Student s1 = new Student("Rehan",29,"Vedanta","FyBCOM");
		Student s2 = new Student("Adarsh",30,"St.Paul","TyBMS");
		Student s3 = new Student("Manoj",24,"C.H.M","TyBAF");
		Student s4 = new Student("Vikram",33,"R.K.T","TyIt");
		Student s5 = new Student("Naresh",21,"South Indian","TyCs");
		
		Student[] s = new Student[5];
		
		s[0] = s1;
		s[1] = s2;
		s[2] = s3;
		s[3] = s4;
		s[4] = s5;
		
		for(Student st : s)
		{
			System.out.println(st);
		}
	}

}
