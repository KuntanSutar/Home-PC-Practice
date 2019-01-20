class P
{
	public String m1()
	{
		return null;
	}
}

class C extends P
{
	public Object m1()	// Return type Object is not compatible with String
	{
		return null;
	}
}

class Asach9
{
	static public void main(String... Kuntan)
	{
		P p = new C();
		p.m1();
	}
}