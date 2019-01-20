// Without curly braces we can take only one statement under if; which should not be declarative
class Alert86
{
	public static void main(String[] args)
	{
		if(true) 					// It is not a valid Java Statement
		int x=10;					// It is local variable to if block. 
									// After that it will be of no use i.e it will go out of it's scope. 
									// Hence, variable declaration is not allowed here.
		if(true)
		{
			int x=10;				// Variable declarations are allowed here.
									// May be in future x can be reused/reassessed in this block/context
		}
	}
}