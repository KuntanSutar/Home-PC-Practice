// Static Control Flow: 2
// RIWO: Read Indirectly Write Once
// R&W: Read & Write Mode

class Fire28
{
	static int i=10;
	
	static
	{
		m1();
		System.out.println(i);	// Direct Read: Original Value // variable i is in R&W Mode
	}
	
	static public void m1()
	{
		System.out.println(i); 	// Indirect Read: Original Value // variable i is in R&W Mode
	}
	
	static public void main(String... Kuntan)
	{
	
	}
}	