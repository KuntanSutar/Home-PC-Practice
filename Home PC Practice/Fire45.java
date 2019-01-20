// We can't take super() & this() simultaneously

class Test
{
	Test()
	{
		super();	
		this();		// call to this must be first statement in constructor
	}
	static public void main(String... Kuntan)
	{
		
	}
}