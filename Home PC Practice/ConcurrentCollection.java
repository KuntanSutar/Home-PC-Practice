import java.util.*;

class ConcurrentCollectionDemo extends Thread
{
	static ArrayList al = new ArrayList( );
	public void run( )
	{
       	try
        {
            Thread.sleep(2000);
        }
       	catch (InterruptedException e)
        {
        }
		// Child thread trying to add new element in the ArrayList
		System.out.println("Child Thread going to add element");
        al.add("D");
	}
 
	public static void main(String[ ] args) throws InterruptedException
	{
        al.add("A");
        al.add("B");
        al.add("C");
 
        // We are creating child thread which is going to modify ArrayList l.
        ConcurrentCollectionDemo t = new ConcurrentCollectionDemo( );
        t.start( );
           	
        // Now main thread iterate through the ArrayList 
        Iterator itr = al.iterator( );
 
		while (itr.hasNext( ))
        {
			String s = (String)itr.next( );
			System.out.println("Main thread iterating ArrayList & current Object is :"+s);
           	Thread.sleep(3000);
        }
		
		System.out.println(al);
	}
}

