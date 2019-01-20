class EH6
{
	static public void main(String... Kuntan)
	{
		try
		{
			System.out.println(10/0);
		}
		
		catch (ArithmeticException e)
		{
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
		}
	}
}