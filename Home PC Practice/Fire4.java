// Every Interface method is always "public & abstract"; whether we are declaring or not!
// Hence, while implementing Interface method compulsory; we should declare it as "public" otherwise we will get CE
interface Fire3
{
	void m1();
	void m2();
}

abstract class Fire4 implements Fire3
{
	void m1()			// CE (Solution: declare it as public)
	{
	}
}
class Fire5 extends Fire4
{
	public void m2()
	{
	}
}