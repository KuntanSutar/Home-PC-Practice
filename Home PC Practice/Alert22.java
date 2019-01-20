// 2 methods are said to be overloaded if they are having same name but different argument types.
// Arguments (int... x) & (int x) are not same.
// They can be in same class or different classes. 

class P
{
	public void m1(int... x)			// Overloaded method (Overloading: Not neccesary to happen in same class)
	{
		System.out.println("Kuntan");
	}
}
class C extends P
{
	public void m1(int x)				// Overloaded method (Overloading: Not neccesary to happen in same class)
	{
		System.out.println("Prasad");
	}
}
class Alert22
{
	public static void main(String[] args)
	{
		P p = new P();
		p.m1(10);
		
		C c = new C();
		c.m1(10);
		
		P p1 = new C();		// Overloading : Reference Type will be considered by compiler
		p1.m1(10);
	}
}