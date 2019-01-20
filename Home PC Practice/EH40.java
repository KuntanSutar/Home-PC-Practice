// Try with multi-catch block

import java.io.*;
class MultiCatchBlock
{
	static public void main(String... Kuntan)
	{
		try
		{
			System.out.println(10/0);
			String str=null;
			System.out.println(str.length());
		}
		catch(ArithmeticException | NullPointerException e)
		{
			System.out.println(e);
		}
	}
}