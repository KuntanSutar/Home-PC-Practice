class Test1
{
	public static void main(String[] args)
	{
		try
		{    
			System.out.println("Statement1");
			System.out.println(10/0);
			System.out.println("Statement3");
		}
		catch (ArithmeticException e)
		{
            System.out.println(10/0);
		}
		System.out.println("Statement5");
	}
}