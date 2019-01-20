// In multi-catch block; there should not be any relationship between Exception types (Either C to P or P to C or same type)
// Otherwise CE

class MultiCatchBlock
{
	static public void main(String... Kuntan)
	{
		try
		{
			
		}
		catch(ArithmeticException | Exception e) // ArithmeticException is Child of Exception
		{
			System.out.println(e);
		}
	}
}