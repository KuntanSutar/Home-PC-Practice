class P
{
	public final void m1()					// Overridden method is final
	{
		System.out.println("Kuntan");		
	}
}

class C extends P
{
	public final void m1()					// Overridden method is final
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