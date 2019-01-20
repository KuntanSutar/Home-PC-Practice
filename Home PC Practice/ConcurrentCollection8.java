import java.util.*;
import java.util.concurrent.*;

class Test 
{
	public static void main(String[] args) 
	{
		ArrayList al1 = new ArrayList();
		al1.add("A");
		al1.add("B");

		CopyOnWriteArrayList cowal = new CopyOnWriteArrayList(); 
		cowal.addIfAbsent("A");
		cowal.addIfAbsent("C");
		cowal.addAll(al1);

		ArrayList al2 = new ArrayList();
		al2.add("A");
		al2.add("E");
		cowal.addAllAbsent(al2);

		System.out.println(cowal); 	// [A, C, A, B, E]
	}
}
