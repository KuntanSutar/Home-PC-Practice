class AutoboxingAutounboxingDemo
{
	static Integer I;	// It is Integer type object. Hence, default value will be "null"
	public static void main(String[] args)
	{ 
		int i=I;	// After compilation it will become "int i=I.intValue();"
		System.out.println(i); // If we perform any operation on null; we will get NullPointerException
	}
}