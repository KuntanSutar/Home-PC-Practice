import java.util.*;
import java.util.concurrent.*;

class Test 
{
	public static void main(String[] args) 
	{ 
		CopyOnWriteArraySet cowas = new CopyOnWriteArraySet();
		cowas.add("A");
		cowas.add("B");
		cowas.add("C");
		cowas.add("A");
		cowas.add(null);
		cowas.add(10);
		cowas.add("D");
		System.out.println(cowas);	// [A, B, C, null, 10, D]
	}
}