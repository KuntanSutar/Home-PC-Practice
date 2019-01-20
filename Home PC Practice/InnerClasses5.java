// How to access members of Outer & Inner Classes in instance method of Inner class.

class Outer
{
	int x=10;
	class Inner
	{
		int x=100;
		public void m1()
		{
			int x=1000;
			System.out.println(x);
			System.out.println(Inner.this.x);	// Equivalent to: System.out.println(this.x);	
			System.out.println(Outer.this.x);
		}
	}
	
	static public void main(String... Kuntan)
	{
		new Outer().new Inner().m1();
	}
}