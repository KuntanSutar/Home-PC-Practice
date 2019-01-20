class Test
{
	int x = 10;
	static int y = 20;
	public void m1()
	{
		class Inner
		{
			public void sum(int x, int y)
			{
				System.out.println("Sum:"+(x+y));
			}	
		}
		
		Inner i = new Inner();
		i.sum(10,20);
		i.sum(20,30);
		i.sum(200,300);
	}
	
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1();
	}
}