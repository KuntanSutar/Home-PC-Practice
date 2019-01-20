// Object type casting - Compile Time Checking 1
// Type of str & StringBuffer must have some relation. 
// Either C to P or P to C or of same type.
// Just Compile

class Alert25
{
	String str = new String("kuntan");
	StringBuffer sb = (StringBuffer) str;
}