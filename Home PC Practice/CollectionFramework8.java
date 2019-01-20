// StringBuffer Class doesn't implement Comparable Interface
// Comparable Interface present in java.lang package

import java.util.*;

class TreeSetDemo
{
	static public void main(String... Kuntan)
	{
		TreeSet ts = new TreeSet();
		ts.add(new StringBuffer("A"));	// ClassCastException
		ts.add(new StringBuffer("B"));	// ClassCastException
		ts.add(new StringBuffer("C"));	// ClassCastException
		ts.add(new StringBuffer("D"));	// ClassCastException
		System.out.println(ts);
	}
}