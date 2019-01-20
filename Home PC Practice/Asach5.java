class P
{
	public void m1()
	{
	}
}

class C extends P
{
	public int m1()	// return type int is not compatible with void
	{
		return 1;
	}
}

class Asach5
{
	static public void main(String... Kuntan)
	{
		int result;
		C c = new C();
		result=c.m1();
	}
}