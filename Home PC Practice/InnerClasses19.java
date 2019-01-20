interface Outer
{
	public void m1();
	interface Inner
	{
		public void m2();
	}
}

class Test1 implements Outer, Outer.Inner
{
	public void m1()
	{
		System.out.println("Test1 - Outer Interface method implementation");
	}
	public void m2()
	{
		System.out.println("Test1 - Inner Interface method implementation");
	}
}

class Test2 implements Outer, Outer.Inner
{
	public void m1()
	{
		System.out.println("Test2 - Outer Interface method implementation");
	}
	public void m2()
	{
		System.out.println("Test2 - Inner Interface method implementation");
	}
}

class Test
{
	static public void main(String... Kuntan)
	{
		Test1 obj1 = new Test1();
		obj1.m1();
		obj1.m2();
		
		Test2 obj2 = new Test2();
		obj2.m1();
		obj2.m2();
	}
}