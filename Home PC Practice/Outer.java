class Outer
{
	int x = 10;
	class Inner
	{
		int x = 100;
		class Innermost
		{
			int x = 1000;
			public void m1()
			{
				int x = 10000;
				System.out.println(x);
				System.out.println(Innermost.this.x);
				System.out.println(Inner.this.x);
				System.out.println(Outer.this.x);
			}	
		}
	}
	
	public static void main(String[] args)
	{
		new Outer().new Inner().new Innermost().m1();
	}
}