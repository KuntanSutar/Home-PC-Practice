class P
{
	int x;
	int y;
	P()
	{
		this.x = m1();
		this.y = m2();
	}
	public int m1()
	{
		return 10;
	}
	public int m2()
	{
		return 20;
	}
}

class C extends P
{
	int x;
	int y;
	C()
	{
		this.x = m1();
		this.y = m2();
	}
	public int m1()
	{
		return 30;
	}
	public int m2()
	{
		return 40;
	}
}

class Test
{
	public static void main(String... Kuntan)
	{
		P p = new C();
		System.out.println(p.x+"..."+p.y);
	}
}