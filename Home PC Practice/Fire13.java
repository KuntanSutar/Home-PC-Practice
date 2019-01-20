// If 2 interfaces contains method with same signature & same return type; then in implementation class; we have to provide implementation for only one method
interface Left
{
	public void m1();
}

interface Right
{
	public void m1();
}

class Fire13 implements Left, Right
{
	public void m1()
	{
	}
}