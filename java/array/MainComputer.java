package array;

public class MainComputer {

	public static void main(String args[])
	{
		Computer c1 = new Computer("HP","Windows","1TB",32,"ssd");
		Computer c2 = new Computer("Dell","Linux","500gb",8,"hdd");
		Computer c3 = new Computer("Acer","Unix","1TB",16,"hdd");
		
		Computer[] c = new Computer[3];
		
		c[0] = c1;
		c[1] = c2;
		c[2] = c3;
		
		for(Computer co : c)
		{
			System.out.print(co.Storage.toUpperCase()+" ");
			System.out.println(co.name);
		}
	}
}
