class A
{
	public void m2()
	{
		System.out.println("A Class's m2 Method");
	}
	class B extends A
	{
		public void m2()
		{
			System.out.println("B Class's m2 Method");
		}
		class C extends B
		{
			public void m1()
			{
				System.out.println("C Class's m1 Method");
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
		c.m1();		// C Class's m1 Method
		
		new A().new B().m2();	// B Class's m2 Method
		
		new A().new B().new C().m1();	// C Class's m1 Method
		
		new A().new B().new C().m2();	// B Class's m2 Method
	}
}