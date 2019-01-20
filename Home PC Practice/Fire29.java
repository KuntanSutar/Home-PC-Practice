// Static Control Flow: 3
// RIWO: Read Indirectly Write Once
// R&W: Read & Write Mode

class Fire29
{
	static
	{
		System.out.println(x);	// Direct Read: CE saying illegal forward reference // variable x is in RIWO mode
	}
	
	static int x=10;
	
	static public void main(String... Kuntan)
	{
	
	}
}	