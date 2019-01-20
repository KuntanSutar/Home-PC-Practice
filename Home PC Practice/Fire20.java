// Object Type Casting: Compiler Time Checking 2

class Fire20
{
	static public void main(String... Kuntan)
	{
		Object obj = new String("Kuntan");		
		StringBuffer strbuf = (String)obj;	// String (C) must be same or derived type of StringBuffer (A)
	}										
}