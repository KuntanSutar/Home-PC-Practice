// If try with multiple catch blocks present; then order of "catch-block" is very important
// compulsory child class should come first & then parent should come after it

class EH7
{
	static public void main(String... Kuntan)
	{
		try
		{
			System.out.println(10/0);
		}
		
		catch (Exception e)	
		{
			
		}
		
		catch (ArithmeticException e)	// exception ArithmeticException has already been caugth
		{
			
		}
	}
}