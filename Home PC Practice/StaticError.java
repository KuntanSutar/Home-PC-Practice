class StaticError 
{
	public int Denom = 3; 			// a normal instance variable
	public static int Val = 1024; 	// a static variable
	/* Error! Can't directly access a non-static variable from within a static method. */
	
	static int ValDivDenom() 
	{
		return Val/Denom; // won't compile!
	}
}