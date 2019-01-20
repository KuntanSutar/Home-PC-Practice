class Outer3
{
	public void m1()
	{
		int x = 10;
		class Inner
		{
			public void m2()
			{
				System.out.println(x);
			}
		}
		new Inner().m2();
	}
	
	public static void main(String[] args)
	{
		new Outer3().m1();
	}
}