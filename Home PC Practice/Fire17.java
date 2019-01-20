// Adapter class is simple Java class; that implements an interface with only empty implementation
interface X
{
	void m1();
	void m2();
	void m3();
	void m4();
}

abstract class AdapterX implements X
{
}

class Fire17 extends AdapterX
{
	void m1()
	{
		System.out.println("m1() method");
	}
	void m2()
	{
		System.out.println("m2() method");
	}
}