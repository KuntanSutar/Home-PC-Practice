// Without using try-catch
class EH3
{
	static public void main(String... Kuntan)
	{
		System.out.println("First Statement");
		System.out.println(10/0);
		System.out.println("Second Statement");
	}
}

// With using try-catch
class EH4
{
	static public void main(String... Kuntan)
	{
		System.out.println("First Statement");
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			System.out.println(10/2);
		}
		System.out.println("Second Statement");
	}
}