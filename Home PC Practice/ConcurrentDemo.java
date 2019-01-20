import java.util.*;
class ConcurrentDemo extends Thread
{
static ArrayList l = new ArrayList( );
public void run( )
{
           	try
           	{
                Thread.sleep(500);
           	}
           	 catch (InterruptedException e)
           	{
                System.out.println("Child Thread going to add element");
           	}
           	 // Child thread trying to add new element in the Collection object
           	l.add("D");
}
 
public static void main(String[ ] args) throws InterruptedException
{
           	l.add("A");
           	l.add("B");
           	l.add("C");
 
           	// We create a child thread that is going to modify ArrayList l.
           	ConcurrentDemo t = new ConcurrentDemo( );
           	t.start( );
           	
           	// Now main thread iterate through the ArrayList l
           	Iterator itr = l.iterator( );
 
           	while (itr.hasNext( ))
           	{
           	String s = (String)itr.next( );
           	System.out.println("Main thread iterating List & current object is :"+ s);
           	Thread.sleep(1000);
           	}
}
 
}
