class Parent
{
	void m1()
	{
		System.out.println("Parent method with void return type & no argument");
	}
	public int m1(int i)
	{
		return i;
	}
}

class Child extends Parent
{
	static int m1()	// m1() in child can't override m1() in parent. return type & modifier is different
	{
		return 10; // Trying to override m1() in parent with & different return type & modifier
	}
	
	static void m1(int i) // m1(int) in child can't override m1(int) in parent. return type & modifier is different
	{
		System.out.println("Trying to override m1(int) in parent with different return type & modifier");
	}
	
	int m1() // m1() in child can't override m1() in parent. return type is different
	{
		return 1; // Trying to override m1() in parent with & different return type
	}
	
	public void m1(int i) // m1(int) in child can't override m1(int) in parent. return type is different
	{
		System.out.println("Trying to override m1(int) in parent with different return type");
	}
	
	static public void main(String... Kuntan)
	{
		int ID1, ID2;
		Parent prt = new Parent();
		prt.m1();
		ID1=prt.m1(10);
		System.out.println(ID1);
		ID2=m1();
		System.out.println(ID2);
	}
}