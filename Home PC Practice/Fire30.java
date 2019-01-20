// Static Control Flow: 4

class Fire30
{
	static
	{
		m1();	
	}
	
	static public void m1()
	{
		System.out.println(x);	// Indirect Read: Default Value // variable x is in RIWO mode
	}
	
	static int x=10;
	
	static public void main(String... Kuntan)
	{
	
	}
}	