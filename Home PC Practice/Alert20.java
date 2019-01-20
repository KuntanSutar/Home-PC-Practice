// Overriding method is static.
// While overloading we can't increase the static level of method.

class P
{
	public void m1()
	{
	}
}
class C extends P
{
	public static void m1()
	{
	}
}