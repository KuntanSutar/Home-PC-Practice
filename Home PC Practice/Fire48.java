class Test
{
	Test()
	{
		this(10);
		System.out.println("No-Arg");
	}
	Test(int i)
	{
		this(10.5);
		System.out.println("Int-Arg");
	}
	Test(double d)
	{
		System.out.println("Double-Arg");
	}
	
	static public void main(String... Kuntan)
	{
		Test t1 = new Test();
		Test t2 = new Test(10);
		Test t3 = new Test(10.5);
		Test t4 = new Test(10l);
	}
}