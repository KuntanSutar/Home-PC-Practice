class P
{
	public void m1()
	{
		System.out.println("Parent class's method");
	}
}

class C extends P
{
	public void m1()
	{
		System.out.println("Child class's method");
	}
}

class Test
{
	public static void main(String... Kuntan)
	{
		P p = new C();
		p.m1();
	}
}