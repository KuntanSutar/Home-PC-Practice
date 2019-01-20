class A
{
	int x=777;
}

class B extends A
{
	int x=888;
}

class C extends B
{
	int x=999;
	
	static public void main(String... Kuntan)
	{
		C c = new C();
		System.out.println(c.x);			// Variable resolution is always based on reference type 
		System.out.println(((B)c).x);		// Variable resolution is always based on reference type 
		System.out.println(((A)((B)c)).x);	// Variable resolution is always based on reference type 
	}
}