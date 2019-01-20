import java.util.*;

class PriorityQueueWithComparatorDemo
{
	static public void main(String... Kuntan)
	{
		PriorityQueue pq = new PriorityQueue(15, new MyComparator());
		pq.offer("A");
		pq.offer("B");
		pq.offer("C");
		pq.offer("D");
		System.out.println(pq);			
	}
}

class MyComparator implements Comparator	
{
	public int compare(Object obj1, Object obj2)
	{
		String str1 = (String)obj1;
		String str2 = (String)obj2;
		
		return str2.compareTo(str1); 	// [D, C, B, A]
	}
}