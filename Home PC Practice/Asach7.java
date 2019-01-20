class P
{
	public P(int t)
	{
		System.out.println("P's parameterized Constructor");
	}
}

class C extends P
{
	P p = new P();	// P(): This type of Constructor is not there in P class. Hence, CE.
}