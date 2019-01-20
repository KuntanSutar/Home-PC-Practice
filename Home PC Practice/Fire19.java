// Object Type Casting: Compiler Time Checking 1

class Fire19
{
	static public void main(String... Kuntan)
	{
		String str = new String("Kuntan");		
		StringBuffer strbuf = (StringBuffer)str;	// type of str (d) i.e String must have some relation (Parent-to-Child, Child-to-Parent or same type) with StringBuffer (C). 
	}												// Otherwise CE
}