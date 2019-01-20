class myThread extends Thread
{
	int total = 0;
	public void run()
	{
		synchronized(this)
		{
			System.out.println("Child Thread starts calculation");
			for(int i=1; i<=100; i++)
			{
				total=total+i;
			}
			System.out.println("Child Thread gives notification");
			this.notify();
		}
	}
}

class interThreadCommunication1
{
	public static void main(String[] args) throws InterruptedException
	{
		myThread t = new myThread();
		t.start();
		synchronized(t)
		{
			System.out.println("Main Thread calls wait() method");
			t.wait();
			System.out.println("Main Thread got notification");
			System.out.println(t.total);
		}
	}
}