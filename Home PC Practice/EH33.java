// StackOverflowError

class EH33
{
	public static void m1()
	{
		m2();
	}
	
	public static void m2()
	{
		m1();
	}
	
	static public void main(String... Kuntan)
	{
		m1();
	}
}