import java.util.*;

class TreeSetDemo
{
	static public void main(String... Kuntan)
	{
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(new StringBuffer("Kuntan"));
		ts.add(new StringBuffer("Prasad"));
		ts.add(new StringBuffer("Kiran"));
		ts.add(new StringBuffer("Shantanu"));
		System.out.println(ts);	// 
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String str1 = obj1.toString();
		String str2 = obj2.toString();
		return str1.compareTo(str2);	
	}
}