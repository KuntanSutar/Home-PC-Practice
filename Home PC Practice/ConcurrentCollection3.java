import java.util.concurrent.*;

class Test 
{
	public static void main(String[] args) 
	{
		ConcurrentHashMap chm = new ConcurrentHashMap();
		chm.put(101, "Prasad");
		chm.replace(101, "Keshav", "Kuntan");
		System.out.println(chm); //{101=Prasad}
		chm.replace(101, "Prasad", "Kuntan");
		System.out.println(chm); //{101=Kuntan}
	}
}

