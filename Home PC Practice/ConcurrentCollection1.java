import java.util.concurrent.*;
 
class Test 
{
	public static void main(String[] args) 
	{
		ConcurrentHashMap chm = new ConcurrentHashMap();
		chm.put(101, "Prasad");
		chm.put(101, "Kuntan");
		System.out.println(chm); 	//{101=Kuntan}
		chm.putIfAbsent(101, "Kiran");
		System.out.println(chm); 	//{101=Kuntan}
		chm.putIfAbsent(102, "Keshav");
		System.out.println(chm);	//{101=Kuntan, 102=Keshav}
	}
}


