// Overriding concept is applicable only for methods; not for variables. 
// Variable resolution is always take care by compiler based on reference type.

class P
{
	int x = 888;
}

class C extends P
{
	static int x = 999;
}

class Alert23
{
	public static void main(String[] args)
	{
		P p = new P();
		System.out.println(p.x);
		
		C c = new C();
		System.out.println(c.x);
		
		P p1 = new C();		// Reference Type will be considered by compiler
		System.out.println(p1.x);
	}
}