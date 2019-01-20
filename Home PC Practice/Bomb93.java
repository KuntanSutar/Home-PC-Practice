// Instance Initialization Block 
// Used to initialize instance variables
// Executed whenever the class is initialized i.e when object of the class is created 
// Executed before constructors are invoked.
// Typically placed above the constructors within braces.
// Not at all necessary to include them in your classes.
// We can also have multiple IIBs in a single class. 
// If compiler finds multiple IIBs, then they all are executed from top to bottom i.e. the IIB which is written at top will be executed first.

class Bomb93
{
	final int x;		
	{				
		x=10;		// final instance variables can be initialized in Instance Initialization Block (IIB)
	}
}