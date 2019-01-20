abstract class P
{
	public abstract String m1();
}

class C extends P
{
	public final String m1()	// abstract method can be overridden as final
	{
		return null;
	}
}

class Asach10
{
	static public void main(String... Kuntan)
	{
		P p = new C();
		p.m1();
	}
}