class EH5
{
	static public void main(String... Kuntan)
	{
		try
		{
			System.out.println("First Statement");
			System.out.println(10/0);
			System.out.println("Third Statement");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Fourth Statement");	// After executing this statement; control never goes back to Third statement. It goes to Fifth Statement
		}
		System.out.println("Fifth Statement");
	}
}