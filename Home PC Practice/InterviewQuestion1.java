// If any Class is not final; but we are not allowed to create child classes. How can you implement it?

class P
{
	private P() 		// defined as private to avoid other classes to create object of Test class
	{
	}
}

class C extends P
{
	
}