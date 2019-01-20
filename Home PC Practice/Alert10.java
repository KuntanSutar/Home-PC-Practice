// Just for compilation & understanding purpose. 
// First, compile it with Java verisons 1.4 using command javac - source 1.4 Alert10.java 
// After that compile it with Java verisons 1.4 onwards & see the difference.  
// Don't run it.

class P
{
	public Object m1()
	{
		return null;
	}
}
class C extends P
{
	public String m1()
	{
		return null;
	}
}

// In overriding; return type must be same; but this rule is applicable until 1.4 V only
// From 1.5 V onwards; we can take co-variant return type also 