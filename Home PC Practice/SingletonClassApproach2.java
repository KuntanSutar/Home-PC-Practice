// How to create our own Singleton classes?
// Approach 2

class Test
{
	private static Test t = null;	// If I don't want to create object initially; then we can use this approach 
	private Test() 		// defined as private to avoid other classes to create object of Test class
	{
	}
	public static Test getTest()
	{
		if(t==null)
		{
			t = new Test();
		}
		return t;
	}
	static public void main(String... Kuntan)
	{
		Test t1 = Test.getTest();
		System.out.println(t1.hashCode());
		Test t2 = Test.getTest();
		System.out.println(t2.hashCode());
		Test t3 = Test.getTest();
		System.out.println(t3.hashCode());
	}
}

class Example
{
	static public void main(String... Kuntan)
	{
		Test t4 = new Test();	// Run Example.class file. You will not able to run it i.e CE! You will not able to create Test class's object.
								// As Test() constructor is private; it can't be accessed from outside the class
	}
}