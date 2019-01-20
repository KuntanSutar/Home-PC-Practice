class Bomb3
{
	static public void main(String... Kuntan)
	{
		int a=10,b=20;
		while(a<b)							// Compiler never consider values of a & b at compile time. It gives chance
		{
			System.out.println("Hello");
		}
		System.out.println("Hi");			// At runtime JVM never checks unreachable statements
	}
}