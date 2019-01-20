// In overriding synchronized, strictfp, native modifiers won't keep any restriction

class P
{
	synchronized public void m1()
	{
	}
}

class C extends P
{
	strictfp public void m1()	
	{
		
	}
}

class Asach6
{
	static public void main(String... Kuntan)
	{
		C c = new C();
		c.m1();
	}
}