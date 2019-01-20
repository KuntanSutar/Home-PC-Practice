// Whenever we are executing Child class following sequence of activities will be executed automatically as a part of "Static Control Flow"
// 1) Identification of static members from parent to child
// 2) Execution of static variables assignments & static blocks from parent to child
// 3) Execution of child class main method only

class Base
{
	static int i=10;
	static
	{
		m1();
		System.out.println("Base Static Block!");
	}
	static public void main(String... Kuntan)
	{
		m1();
		System.out.println("Base Main method!");
	}
	static public void m1()
	{
		System.out.println(j);
	}
	static int j=20;
}

class Derived extends Base
{
	static int x=100;
	static
	{
		m2();
		System.out.println("Derived First Static Block!");
	}
	static public void main(String... Kuntan)
	{
		m2();
		System.out.println("Derived Main method!");
	}
	static public void m2()
	{
		System.out.println(y);
	}
	static
	{
		System.out.println("Derived Second Static Block!");
	}
	static int y=200;
} 