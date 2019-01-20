// Runnable Interface have run functionality.
// Thread Class have start functionality.

class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			System.out.println("Child Thread");
		}
	}
}
class ThreadDemo
{
	static public void main(String... Kuntan)
	{
		MyRunnable mr = new MyRunnable();
		mr.start();	// Until & unless you don't create Thread class object; you won't able to start the Thread.
		for(int i=0; i<10; i++)
		{
			System.out.println("Main Thread");
		}
	}
}