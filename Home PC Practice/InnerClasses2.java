// Accessing Inner Class data from instance area of Outer Class.
// Here, Outer Class object already created at line number 23 inside main() method.
// Hence, it is possible to call m1() method of Inner Class by creating it's object only. Line number 18.

class Outer
{
	class Inner
	{
		public void m1()
		{
			System.out.println("Inner Class m1 Method");
		}
	}
	
	public void m2()
	{
		Inner i1 = new Inner();
		i1.m1();
	}
	
	static public void main(String... Kuntan)
	{
		Outer o1 = new Outer();
		o1.m2();
	}
}