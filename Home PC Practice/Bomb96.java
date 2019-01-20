// For local variables; JVM will not provide default values
// Hence, comulsory we have to perform initialization explicitely before using them
// Eventhough local variable is final; before using only we have to perform initialization; otherwise it is not necessary

class Bomb96
{
	static public void main(String... args)
	{
		final int x;
		System.out.println(x);		// CE: variable x might not have been initialized
	}
}