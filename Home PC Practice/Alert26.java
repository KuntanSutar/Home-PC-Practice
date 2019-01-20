// Object type casting - Compile Time Checking 2
// String must be either same or derived type of StringBuffer
// Just Compile

class Alert25
{
	Object o = new String("kuntan");
	StringBuffer sb = (String) o;
}