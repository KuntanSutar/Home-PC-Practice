// Rethrowing Exception

class EH42
{
	static public void main(String... Kuntan)
	{
		try
		{
			System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{
			throw new NullPointerException();
		}
	}
}