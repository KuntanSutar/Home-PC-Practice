// Object type casting - Runtime Checking
// Runtime object type of o must be either same or derived type of StringBuffer
// Run this code
/*
class Alert27
{
	public static void main(String[] args)
	{
		Object o = new String("kuntan");
		StringBuffer sb = (StringBuffer) o;
	}
}
*/

class Alert27
{
	public static void main(String[] args)
	{
		Object o = new String("kuntan");
		Object o1 = (String) o;
	}
}
