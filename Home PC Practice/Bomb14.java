class Bomb14
{
	static public void main(String... Kuntan)
	{
		int a=10,b=20;							// normal variables: may be a chance of changing. Compiler never consider values of these variables.
		do
		{
			System.out.println("Hello");
		}
		while(a<b);
		System.out.println("Hi");				// Control will not reach here anytime. Hence, unreachable statement. But, at runtime JVM will not check unreachable statements. 
	}
}