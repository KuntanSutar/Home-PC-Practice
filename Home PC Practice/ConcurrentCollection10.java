import java.util.*;
import java.util.concurrent.*;

class ConcurrentCollectionDemo 
{
	public static void main(String[] args)
	{
		ArrayList cowal = new ArrayList();
		cowal.add("A");
		cowal.add("B");
		cowal.add("C");
		cowal.add("D");
		System.out.println(cowal); // [A, B, C, D]
		Iterator itr = cowal.iterator();
		while (itr.hasNext()) 
		{
			String s = (String)itr.next();
			if(s.equals("D"))
			{
				itr.remove();
			}
		}
		System.out.println(cowal); // [A, B, C]
	}
}
