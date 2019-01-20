// Object Type Casting: Runtime Checking 

class Fire21
{
	static public void main(String... Kuntan)
	{
		Object obj = new String("Kuntan");		
		StringBuffer strbuf = (StringBuffer)obj;	// Runtime object type of obj (d) i.e String must be same or derived type of StringBuffer (C). Hence, RE
	}										
}