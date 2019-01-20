class Test
{
	Test()
	{
		this(10);	// recursive constructor invocation not possible
	}
	Test(int i)
	{
		this();		// recursive constructor invocation not possible
	}
	static public void main(String... Kuntan)
	{
		System.out.println("Hello");
	}
}