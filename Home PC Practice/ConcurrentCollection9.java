import java.util.*;
import java.util.concurrent.*;

class MyThread extends Thread 
{
	static CopyOnWriteArrayList cowal = new CopyOnWriteArrayList();
	
	public void run()
	{
		try
		{ 
			Thread.sleep(2000);
		} 
		catch(InterruptedException e) 
		{
		}
		System.out.println("Child Thread Updating COWAL!");
		cowal.add("C");
	}
	
	static public void main(String... Kuntan) throws InterruptedException 
	{
		cowal.add("A");
		cowal.add("B");
		MyThread t = new MyThread();
		t.start();
		Iterator itr = cowal.iterator();
		while(itr.hasNext())
		{
			String s = (String)itr.next();
			System.out.println("Main Thread iterating COWAL & current object is: "+s);
			Thread.sleep(3000);
		}
		System.out.println(cowal);
	}
}

/*
Main Thread iterating COWAL & current object is: A
Child Thread Updating COWAL!
Main Thread iterating COWAL & current object is: B
[A, B, C]
*/

