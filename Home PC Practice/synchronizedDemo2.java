class Display
{
	public synchronized void displayn()
	{
		for(int i=1; i<=10; i++)
		{
			System.out.println(i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
	
	public synchronized void displayc()
	{
		for(int i=65; i<=75; i++)
		{
			System.out.println((char)i);
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
			}
		}
	}
}

class myThread1 extends Thread
{
	Display d;
	myThread1(Display d)
	{ 
		this.d=d;
	}
	public void run()
	{
		d.displayn();
	}
}

class myThread2 extends Thread
{
	Display d;
	myThread2(Display d)
	{ 
		this.d=d;
	}
	public void run()
	{
		d.displayc();
	}
}

class synchronizedDemo2
{
	public static void main(String[] args)
	{
		Display d = new Display();
		myThread1 t1 = new myThread1(d);
		myThread2 t2 = new myThread2(d);
		t1.start();
		t2.start();
	}
}
