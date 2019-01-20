// Overridden method is static.
// While overloading we can't decrease the static level of method.

class P
{
	public static void m1()
	{
	}
}
class C extends P
{
	public void m1()
	{
	}
}