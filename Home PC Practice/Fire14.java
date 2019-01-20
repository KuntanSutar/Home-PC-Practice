// If 2 interfaces contains method with same name & different argument types; then in implementation class; we have to provide implementation both the method
// These methods will act as overloaded methods
interface left
{
	public void m1();
}

interface Right
{
	public void m1(int i);
}

class Fire14 implements Left, Right
{
	public void m1()
	{
	}
	public void m1(int i)
	{
	}
}