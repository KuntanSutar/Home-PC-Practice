import java.util.*;

class LinkedHashSetDemo
{
	static public void main(String... Kuntan)
	{
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("A");
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add(null);
		lhs.add(10);
		lhs.add("E");
		lhs.add("F");
		lhs.add("G");
		lhs.add("H");
		lhs.add(null);
		lhs.add(10);
		lhs.add("I");
		lhs.add("J");
		lhs.add("K");
		lhs.add("L");
		lhs.add("M");
		lhs.add("N");
		lhs.add("O");
		//System.out.println(lhs.capacity());	No such method
		System.out.println(lhs.add("A"));	// false
		System.out.println(lhs);	// [A, B, C, D, null, 10, E, F, G, H, I, J, K, L, M, N, O]
	}
}