class Display
{
	public void wish(String name)
	{
		;;;;;;;
		synchronized(this)
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
		;;;;;;;
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

class synchronizedDemo3
{
	public static void main(String[] args)
	{
		Display d = new Display();
		myThread t1 = new myThread(d,"kuntan");
		myThread t2 = new myThread(d,"prasad");
		t1.start();
		t2.start();
	}
}