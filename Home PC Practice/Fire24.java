class A
{
	void m1()
	{
		System.out.println("A");
	}
}

class B extends A
{
	void m1()
	{
		System.out.println("B");
	}
}

class C extends B
{
	void m1()
	{
		System.out.println("C");
	}
	
	static public void main(String... Kuntan)
	{
		C c = new C();
		c.m1();
		((B)c).m1();	// It is same as B b = new C();
		((A)((B)c)).m1();	// It is same as A a = new C(); It is overriding. In it method resolution is always based on runtime object
	}
}