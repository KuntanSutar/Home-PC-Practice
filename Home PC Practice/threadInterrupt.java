class myThread extends Thread
{
	public void run()
	{
		for(int i=0; i<=10000; i++)
		{
			System.out.println("I am lazy thread"+i);
		}
		System.out.println("I want to sleep");
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			System.out.println("I got interrupted");
		}
	}
}

class threadInterrupt
{
	public static void main(String[] args)
	{
		myThread t = new myThread();
		t.start();
		t.interrupt();
		System.out.println("End of main thread");
	}
}