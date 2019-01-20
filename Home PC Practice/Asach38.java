class P
{
	P()
	{
		int x = 10;
	}
}

class C extends P
{
	C()
	{
		int x = 100;
	}
}

class Test
{
	public static void main(String... Kuntan)
	{
		P p = new C();
	}
}