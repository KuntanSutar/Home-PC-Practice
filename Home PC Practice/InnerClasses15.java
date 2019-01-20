class Outer
{
	static class Nested	// This is Static Nested Class
	{
		public void m1()
		{
			System.out.println("Static Nested Class method");
		}
	}
	
	static public void main(String... Kuntan)
	{
		Outer.Nested n1 = new Outer.Nested();	// Not required to take Outer class's Name. 
		n1.m1();	// Because, in the case of Static Nested Class there may be a chance of existing Static Nested Class object, without existing Outer Class object. 
					// Static Nested Class's object not strongly associated with Outer Class object.
		
		Nested n2 = new Nested();
		n2.m1();
	}
}

class Test extends Outer.Nested
{
	static public void main(String... Kuntan)
	{
		Outer.Nested n1 = new Outer.Nested();	
		n1.m1();		
	}
}