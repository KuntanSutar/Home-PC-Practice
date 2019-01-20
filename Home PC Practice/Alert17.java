// Very wrong coding habbit; please improve it as early as possible.
// Assigning weaker acess privileges.
class P
{
	void m1()					
	{
		System.out.println("Kuntan");		
	}
}
class C extends P
{
	protected void m1()					
	{
		System.out.println("Prasad");
	}
}
class GC extends C
{
	public void m1()
	{
		System.out.println("Kiran");		
	}
}
class GCC extends GC
{
	protected void m1()
	{
		System.out.println("Babu");		
	}
}
