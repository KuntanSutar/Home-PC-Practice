// Static Control Flow: 1
// RIWO: Read Indirectly Write Once
// R&W: Read & Write Mode

// Whenever we are executing Java Class; following sequence of activities will be executed as a part of Static Control Flow:
// 1. Identification of static members from top to bottom
// 2. Execution of static variables assignments & static blocks from top to bottom
// 3. Execution of main method
  
class Fire27
{
	static int i=10;
	static 
	{
		m1();
		System.out.println("First Static Block!");
	}
	
	static public void main(String... Kuntan)
	{
		m1();
		System.out.println("Main Method");
	}
	
	static public void m1()
	{
		System.out.println(j);	// For the 1st time: Indirect Access: Default Value // variable j is in RIWO Mode
								// For the 2nd time: Indirect Access: Original Value // variable j is in R&W Mode
	}
	
	static 
	{
		System.out.println("Second Static Block!");
	}
	
	static int j=20;
}