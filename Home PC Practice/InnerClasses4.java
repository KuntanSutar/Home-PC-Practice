// From Normal Inner Class, we can access both static & non-static members of Outer Class directly.

class Outer
{
	int x=10;
	static int y=20;
	
	class Inner
	{
		public void m1()
		{
			System.out.println(x);
			System.out.println(y);
		}
	}
	
	static public void main(String... Kuntan)
	{
		new Outer().new Inner().m1();
	}
}