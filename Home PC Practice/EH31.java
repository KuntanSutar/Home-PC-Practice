// Within "try block", if there is no chance of rising particular exception; then we can't write "catch" block for that Exception
// Hence, we will get CE
// But, this rule is only applicable for "Fully Checked" Exception

import java.io.*;
class EH31
{
	static public void main(String... Kuntan)
	{
		try
		{
			System.out.println("Hello");
		}
		catch(Error e)	// InterruptedException is Fully Checked Exception
		{
		}
	}
}