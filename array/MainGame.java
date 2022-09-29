package array;

public class MainGame {

	public static void main(String args[])
	{
		Game g1 = new Game("God of war", "Adventure", "96 Hours");
		Game g2 = new Game("Call of Duty", "Adventure", "48 Hours");
		Game g3 = new Game("Apex Legends", "Arcade", "No Limit");
		
		Game[] g = new Game[3];
		
		g[0] = g1;
		g[1] = g2;
		g[2] = g3;
		
		for (Game ga : g)
		{
			System.out.println("Game name: " + ga.name.toUpperCase() + ". ");
			System.out.println("Game type: " + ga.Type.toUpperCase() + ". ");
			System.out.println("Game duration: " + ga.Duration.toLowerCase() + ". ");
			System.out.println();
			//System.out.println(ga);
			
		}
		
	}
}
