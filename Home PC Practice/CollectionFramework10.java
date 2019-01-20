import java.util.*;

class TreeSetWithComparatorDemo1
{
	static public void main(String... Kuntan)
	{
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(10);	
		ts.add(0);	
		ts.add(15);	
		ts.add(20);	
		ts.add(20);	
		System.out.println(ts);		// [20, 15, 10, 0]
	}
}

class MyComparator implements Comparator	// Comparator present in java.util package
{
	public int compare(Object obj1, Object obj2)
	{
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		
		if(I1<I2)
		{
			return +1;		// Returning positive value to put I1 after I2 i.e  + value = after 
		}
		else if(I1>I2)
		{
			return -1;		// Returning negative value to put I1 before I2 i.e  - value = before 
		}
		else
		{
			return 0;
		}
	}
}