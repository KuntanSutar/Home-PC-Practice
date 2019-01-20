class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0; i<10; i++)
		{
			System.out.print("GM:");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
			}
			System.out.println(name);
		}
	}
}

class myThread extends Thread
{
	Display d;
	String name;
	myThread(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	public void run()
	{
		d.wish(name);
	}
}

class synchronizedDemo1
{
	public static void main(String[] args)
	{
		Display d1 = new Display();
		Display d2 = new Display();
		myThread t1 = new myThread(d1,"kuntan");
		myThread t2 = new myThread(d2,"prasad");
		t1.start();
		t2.start();
	}
	
}