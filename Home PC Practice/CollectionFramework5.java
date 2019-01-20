import java.util.*;

class HashSetDemo
{
	static public void main(String... Kuntan)
	{
		HashSet hs = new HashSet();
		hs.add("A");
		hs.add("B");
		hs.add("C");
		hs.add("D");
		hs.add(null);
		hs.add(10);
		hs.add("E");
		hs.add("F");
		hs.add("G");
		hs.add("H");
		hs.add(null);
		hs.add(10);
		hs.add("I");
		hs.add("J");
		hs.add("K");
		hs.add("L");
		hs.add("M");
		hs.add("N");
		hs.add("O");
		//System.out.println(hs.capacity());	No such method
		System.out.println(hs.add("A"));	// false
		System.out.println(hs);		// [null, A, B, C, D, E, F, G, H, I, 10, J, K, L, M, N, O]
	}
}