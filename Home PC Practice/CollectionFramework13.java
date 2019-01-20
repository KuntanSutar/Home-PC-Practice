import java.util.*;

class PriorityQueueDemo
{
	static public void main(String... Kuntan)
	{
		PriorityQueue pq = new PriorityQueue(15, new Comparator);
		System.out.println(pq.peek());			//null
		//System.out.println(pq.element()); 	NoSuchElementException
		for(int i=0; i<10; i++)
		{
			pq.offer(i);
		}
		System.out.println(pq);			// [0,1,2,3,4,5,6,8,9]
		System.out.println(pq.poll());	// 0
		System.out.println(pq);			// [1,3,2,7,4,5,6,9,8]
	}
}