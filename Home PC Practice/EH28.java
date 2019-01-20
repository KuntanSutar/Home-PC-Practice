// Within "try block", if there is no chance of rising particular exception; then we can't write "catch" block for that Exception
// Hence, we will get CE: Exception is never thrown in body of corresponding "try" statement
// But, this rule is only applicable for "Fully Checked" Exception

class EH28
{
	static public void main(String... Kuntan)
	{
		try
		{
			System.out.println("Hello");
		}
		catch(ArithmeticException e)	// ArithmeticException is Unchecked Exception
		{
		}
	}
}