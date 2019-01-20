// We can't declare 2 "catch blocks" for same exception.
// Otherwise CE 

class EH8
{
	static public void main(String... Kuntan)
	{
		try
		{
			System.out.println(10/0);
		}
		
		catch (ArithmeticException e)	
		{
			
		}
		
		catch (ArithmeticException e)	// exception ArithmeticException has already been caugth
		{
			
		}
	}
}