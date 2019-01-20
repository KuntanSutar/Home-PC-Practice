// How can you create a class that can't be instanciated without using abstract modifier 

class Test
{
	private static Test t = new Test();
	
	private Test() 		// defined as private to avoid other classes to create object of Test class
	{
	}
	
	public static Test getTest()
	{
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
		Test t4 = new Test();
	}
}