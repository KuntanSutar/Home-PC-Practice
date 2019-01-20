class P
{
	void m1()
	{
		System.out.println("m1");
	}
}

class C extends P
{
	void m2()
	{
		System.out.println("m2");
	}
	
	static public void main(String... Kuntan)
	{
		C c = new C();
		//P p = new P();
		((P)c).m1();
		//((P)c).m2();	// It is same as P p = new C(); Parent refernce can be used to hold Child object. 
						// But, by using that refernce; we can't call child specific methods 
	}
}