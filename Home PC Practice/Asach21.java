class P
{
	int x=10;
	public void print()
	{
		System.out.println(x);
	}
}
class C extends P
{
	static public void main(String... Kuntan)
	{
		P p = new P();
		p.print();
		p.x=20;
		System.out.println(p.x);
	}
}