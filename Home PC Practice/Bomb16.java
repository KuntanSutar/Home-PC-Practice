class Bomb16
{
	static public void main(String... Kuntan)
	{
		final int a=10,b=20;					// final variables: No chance of changing. Compiler considers values of these variables.
		do
		{
			System.out.println("Hello");
		}
		while(a<b);
		System.out.println("Hi");				// Control will not reach here anytime. Hence, unreachable statement. 
	}
}