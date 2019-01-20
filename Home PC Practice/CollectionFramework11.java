import java.util.*;

class TreeSetWithComparatorDemo2
{
	static public void main(String... Kuntan)
	{
		TreeSet ts = new TreeSet(new MyComparator());
		ts.add(10);	
		ts.add(0);	
		ts.add(15);
		ts.add(5);			
		ts.add(20);	
		ts.add(20);	
		System.out.println(ts);		
	}
}

class MyComparator implements Comparator	// Comparator present in java.util package
{
	public int compare(Object obj1, Object obj2)
	{
		Integer I1 = (Integer)obj1;
		Integer I2 = (Integer)obj2;
		
		//return I1.compareTo(I2); 		[0, 5, 10, 15, 20]
		//return -I1.compareTo(I2); 	[20, 15, 10, 5, 0]
		//return I2.compareTo(I1);		[20, 15, 10, 5, 0]
		//return -I2.compareTo(I1);		[0, 5, 10, 15, 20]
		//return +1;  Insertion Order : [10, 0, 15, 5, 20, 20]	Everytime it returns +1; hence dumb JVM will not check for duplicates
		//return -1; Reverse of Insertion Order : [20, 20, 5, 15, 0, 10]  Everytime it returns -1; hence dumb JVM will not check for duplicates
		//return 0;	// Only First Element i.e 10 will be inserted. Remaining will be considered as duplicates 
	}
}