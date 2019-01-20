import java.util.*;
import java.util.concurrent.*;

class MyThread extends Thread 
{
	static ConcurrentHashMap chm = new ConcurrentHashMap();
	public void run()
	{
		try
		{
			Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
		}
		System.out.println("Child Thread trying to update Map!");
		chm.put(103,"Keshav");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		chm.put(101, "Kuntan");
		chm.put(102, "Prasad");
		
		MyThread mt = new MyThread();
		mt.start();
		
		Set s = chm.keySet();
		Iterator itr = s.iterator();
		while(itr.hasNext())
		{
			Integer I = (Integer)itr.next();
			System.out.println("Main Thread iterating Map & current Entry is :"+I+"..."+chm.get(I));
			Thread.sleep(3000);
		}
		System.out.println(chm); 	
	}
}

/*
O/P: 
Main Thread iterating Map & current Entry is :101...Kuntan
Child Thread trying to update Map!
Main Thread iterating Map & current Entry is :102...Prasad
Main Thread iterating Map & current Entry is :103...Keshav
{101=Kuntan, 102=Prasad, 103=Keshav}
*/