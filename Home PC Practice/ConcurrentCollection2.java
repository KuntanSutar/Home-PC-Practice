import java.util.concurrent.*;

class Test 
{
	public static void main(String[] args) 
	{
		ConcurrentHashMap chm = new ConcurrentHashMap();
		chm.put(101, "Kuntan");
		chm.remove(101, "Prasad"); 	// Corresponding value not matched with key, so entry is not removed 
		System.out.println(chm); 	// {101=Kuntan} 
		chm.remove(101, "Kuntan");
		System.out.println(chm); 	// {}
	}
}
