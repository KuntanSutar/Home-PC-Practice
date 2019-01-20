class Outer
{
	int i = 10;
	static int j = 20;
	public void m1()
	{
		int k = 30;
		final int l = 40;
		class Inner
		{
			public void m2()
			{
				System.out.println(i);	// 10
				System.out.println(j);	// 20
				System.out.println(k);	// 30	CE: (1.7 V) local variable y is accessed from within inner class; needs to be declared final.
				System.out.println(l);	// 40
			}
		}
		Inner i = new Inner();
		i.m2();
	}
	
	public static void main(String[] args)
	{
		Outer o = new Outer();
		o.m1();
	}
}