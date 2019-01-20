abstract class P
{
	abstract void name();
}

class C extends P
{
	final void name()	// abstract method can be overridden as final
	{
		System.out.println("Prasad");
	}
}

class Asach1
{
	static public void main(String... Kuntan)
	{
		P p = new C();
		p.name();
	}
}