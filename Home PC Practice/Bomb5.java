// final (fixed) variables: No chance of changing
class Bomb5
{
	static public void main(String... Kuntan)
	{
		final int a=10,b=20;				// Compiler considers value
		while(a<b)							// Condition will be always true.
		{
			System.out.println("Hello");
		}
		System.out.println("Hi");			// Control will not reach here anytime. Hence, unreachable statement
	}
}