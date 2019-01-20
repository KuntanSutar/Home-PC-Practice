class P
{
	public void property()
	{
		System.out.println("Cash+Land+Gold");
	}
	public void marry()
	{
		System.out.println("SL");
	}
	//public void dance() If dance() method is not declared in P class then; compiler won't allow compilation to proceed forward i.e (Error)
}

class C extends P
{
	public void marry()
	{
		System.out.println("3sha");
	}
	public void dance()
	{
		System.out.println("Dance");
	}
}

class Alert9
{
	public static void main(String[] args)
	{
		P p1 = new P();
		p1.marry();
	
		C c = new C();
		c.marry();
	
		P p2 = new C();
		p2.marry();	
		//p1.dance();
	}	
}