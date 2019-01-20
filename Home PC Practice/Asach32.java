class MyClass 
{
	int x;
	MyClass() 
	{
		this.x = 10;
	}
}

class Test 
{
	public static void main(String... Kuntan) 
	{
		MyClass t1 = new MyClass();
		MyClass t2 = new MyClass();
		System.out.println(t1.x + " " + t2.x);
	}
}