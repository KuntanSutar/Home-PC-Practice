class P
{
	public void m1()
	{
		System.out.println(1);
	}
}

class C extends P
{
	public String m1()	// Return type String is not compatible with void
	{
		return "abc";
	}
}

class Asach4
{
	static public void main(String... Kuntan)
	{
		String result;
		P p = new C();
		p.m1();
		result=p.m1();
		System.out.println(result);
	}
}
