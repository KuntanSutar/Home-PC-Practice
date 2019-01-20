// Accessing Inner Class data from static area of Outer Class.

class Outer
{
	class Inner
	{
		public void m1()
		{
			System.out.println("Inner Class m1 Method");
		}
	}
	
	static public void main(String... Kuntan)
	{
		Outer o1 = new Outer();
		Outer.Inner i1 = o1.new Inner();
		i1.m1();
		
		Outer.Inner i2 = new Outer().new Inner();
		i2.m1();
		
		new Outer().new Inner().m1();
	}
}