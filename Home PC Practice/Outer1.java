class Outer1
{
	int x = 10;
	class Inner
	{
		class Innermost
		{
			int x = 100;
			public void m1()
			{
				System.out.println(x);
			}	
		}
	}
	
	public static void main(String[] args)
	{
		new Outer().new Inner().new Innermost().m1();
	}
}