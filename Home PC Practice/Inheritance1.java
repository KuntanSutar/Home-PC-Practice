class Parent
{
	void m1()
	{
		System.out.println("parent");
	}
}
class Child extends Parent
{
	void m2()
	{
		System.out.println("child");
	}
}
class Inheritance1
{
	public static void main(String[] args)
	{
		Parent p1 = new Parent();
		p1.m1();
		p1.m2();
	
		Child c1 = new Child();
		c1.m1();
		c1.m2();
	
		Parent p2 = new Child();
		p2.m1();
		p2.m2();
	
		Child c2 = new Parent();
	}
}