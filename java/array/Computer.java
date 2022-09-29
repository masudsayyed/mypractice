package array;

public class Computer {
	
	String name;
	int ram;
	String Storage;
	String Storagetype;
    String os_used;
    
    Computer(String name, String os_used, String Storage, int ram, String Storagetype)
    {
    	this.name = name;
    	this.os_used = os_used;
    	this.Storage = Storage;
    	this.ram = ram;
    	this.Storagetype = Storagetype;
    }
    
    
    @Override
    public String toString()
    {
    	return "name: "+name+" os_used: "+os_used+" Storage: "+Storage+" ram: "+ ram +" Storagetype: "+Storagetype;
    }
}
