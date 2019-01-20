import java.util.*;
import java.util.concurrent.*;

class Test 
{
	static public void main(String... Kuntan)
	{
		ArrayList al1 = new ArrayList();
		al1.add("A");
		al1.add("B");

		CopyOnWriteArrayList cowal = new CopyOnWriteArrayList();
		cowal.add("A");
		cowal.add("C");
		System.out.println(cowal); //[A, C]
		cowal.addAll(al1);
		System.out.println(cowal); //[A, C, A, B]

		ArrayList al2 = new ArrayList();
		al2.add("A");
		al2.add("D");
		System.out.println(cowal.addAllAbsent(al2));	// 1
		System.out.println(cowal); //[A, C, A, B, D]
	}
}