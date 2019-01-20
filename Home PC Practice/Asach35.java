class Test
{
	public static void staticMethod()
	{
		System.out.println("My static method!");
	}
	
	static public void main(String... Kuntan)
	{
		Test t = new Test();
		t.staticMethod();
	}
}