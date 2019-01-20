import java.util.concurrent.*;

class ConcurrentCollectionDemo
{
	static public void main(String... Kuntan)
	{
		CopyOnWriteArrayList cowal = new CopyOnWriteArrayList();
		cowal.add("A");
		cowal.add("A");
		cowal.addIfAbsent("B");
		System.out.println(cowal.addIfAbsent("B"));	// false
		System.out.println(cowal); 					// [A, A, B]
	}
}

