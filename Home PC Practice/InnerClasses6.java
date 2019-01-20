class A
{
	class B extends A
	{
		class C extends B
		{
			public void m1()
			{
				System.out.println("Innermost Class Method");
			}
		}
	}
}

class Test
{
	static public void main(String... Kuntan)
	{
		A a = new A();
		A.B b = a.new B();
		A.B.C c = b.new C();
		c.m1();		// Innermost Class Method
		
		new A().new B().new C().m1();	// Innermost Class Method
	}
}