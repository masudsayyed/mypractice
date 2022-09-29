package array;

public class Game {
	String name;
	String Duration;
	String Type;
	
	Game(String name, String Type, String Duration)
	{
		this.Duration = Duration;
		this.name = name;
		this.Type = Type;
	}
	
	/*@Override
	public String toString()
	{
		return "Game Name: "+name.toUpperCase()+" Game Duration: "+ Duration +" Game type: "+Type+".";
	}*/

}
