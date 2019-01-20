// Whenever we are executing java class; first static control flow will be executed.
// In static control flow if we are creating an object the following sequence of events will be executed as a part of instance control flow 
// Instance Control Flow:
// 1) Identification of instance members from top to bottom
// 2) Execution of instance variable assignments & instance blocks from top to bottom
// 3) Execution of Constructorss 

class Fire37
{
	int i=10;
	{
		m1();
		System.out.println("First Instance Block");
	}
	Fire37()
	{
		System.out.println("Constructor");
	}
	static public void main(String... Kuntan)
	{
		Fire37 fire1 = new Fire37();
		System.out.println("Main");
		//Fire37 fire2 = new Fire37();
	}
	public void m1()
	{
		System.out.println(j);
	}
	{
		System.out.println("Second Instance Block");
	}
	int j=20;
}