// If Child class method throws any Checked Exception; compulsory Parent class method should throw same Checked Exception or it's Parent type exception
// Otherwise CE
// Just for compilation & understanding purpose.  
// Don't run it.

import java.io.*;
class P
{
	public void m1() throws IOException
	{
		System.out.println("Kuntan");	
	}
}

class C extends P
{
	public void m1() throws Exception, EOFException, InterruptedException
	{
		System.out.println("Prasad");	
	}
}