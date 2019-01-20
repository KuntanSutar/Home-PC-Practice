class Test
{
	public static void main(String... Kuntan)
	{
		Thread t1 = new Thread()
		{
			public void run()
			{
				for(int i=0; i<=10; i++)
				{
					if(i%2==0)
					{
						System.out.println("Number"+i+"is Even!");
					}
				}
			}
		};
	
		Thread t2 = new Thread()
		{
			public void run()
			{
				for(int i=0; i<=10; i++)
				{
					if(i%2==1)
					{
						System.out.println("Number"+i+"is Odd!");
					}
				}
			}
		};
			
		t1.start();
		t2.start();
	}
}
	
	
	