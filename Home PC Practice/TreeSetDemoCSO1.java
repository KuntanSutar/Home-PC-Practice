import java.util.*;

class TreeSetDemo
{
	static public void main(String... Kuntan)
	{
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add("Kuntan");
		ts.add("Prasad");
		ts.add("Kiran");
		ts.add("Shantanu");
		System.out.println(ts);	// [Shantanu, Prasad, Kuntan, Kiran]
	}
}

class MyComparator implements Comparator
{
	public int compare(Object obj1, Object obj2)
	{
		String str1 = obj1.toString();
		String str2 = (String)obj2;
		return str2.compareTo(str1);	
		//return -str1.compareTo(str2);	
	}
}