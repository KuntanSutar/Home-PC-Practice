abstract class P
{
	public void m1()
	{
		System.out.println("Parent Method");
	}
}
class C extends P
{
	public static void m2()
	{
		System.out.println("Child Method");
	}
	static public void main(String... Kuntan)
	{
		C.m2();
	}
}