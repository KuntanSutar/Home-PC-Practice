// It is Method Hiding because of static keyword in both methods of class P & C
// Not Method Overriding
class P
{
	public static void m1()
	{
		System.out.println("Kuntan");
	}
}
class C extends P
{
	public static void m1()
	{
		System.out.println("Prasad");
	}
}
class Alert21
{
	public static void main(String[] args)
	{
		P p = new P();
		p.m1();
		
		C c = new C();
		c.m1();
		
		P p1 = new C();		// Method Hiding. Compiler w.r.t reference type
		p1.m1();
	}
}