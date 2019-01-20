import java.util.*;
import java.util.concurrent.*;

class Test 
{
	public static void main(String[] args)
	{
		CopyOnWriteArrayList cowal = new CopyOnWriteArrayList(); 
		cowal.add("A");
		cowal.add("B");
		cowal.add("C");
		Iterator itr = cowal.iterator(); 
		cowal.add("D");

		while (itr.hasNext()) 
		{
			String s = (String)itr.next(); 
			System.out.println(s);
		}
	}
}
