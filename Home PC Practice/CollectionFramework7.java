import java.util.*;

class TreeSetDemo
{
	static public void main(String... Kuntan)
	{
		TreeSet ts = new TreeSet();
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		ts.add("a");
		ts.add("b");
		ts.add("c");
		ts.add("d");
		//ts.add(null);							NullPointerException
		//ts.add(10);							ClassCastException
		//ts.add(new Integer(10));				ClassCastException
		//ts.add(new StringBuffer("A"));		ClassCastException
		//ts.add(new StringBuffer("B"));		ClassCastException
		System.out.println(ts.add("A"));		// false
		//System.out.println(ts.capacity());	No such method
		System.out.println(ts);					// [A, B, C, D, a, b, c, d]
		System.out.println(ts.comparator());	// null : Default Natural Sorting Order
		ts.add("Z");
		ts.add("U");
		System.out.println(ts);					// [A, B, C, D, U, Z, a, b, c, d]
	}
}