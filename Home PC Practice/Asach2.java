class P
{
	void realName()
	{
		System.out.println("Kuntan");
	}
}

abstract class C extends P
{
	abstract void realName();	// We can override non-abstract method as abstract. We can stop availability of Parent class's method implementation by this approach 
}

class Asach2
{
	static public void main(String... Kuntan)
	{
		P p = new C();	// C is abstract; hence can't be instantiated
		p.realName();
	}
}