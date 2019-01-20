// Whenever we are creating child class object; following sequence of events will be performed automatically as a part of instance control flow
// 1) Identification of instance members from Parent to Child
// 2) Execution of instance variable assignments & instance blocks only in parent class
// 3) Execution of parent constructor
// 4) Execution of instance variable assignments & instance blocks in child class
// 5) Execution of child constructor

class Parent
{
	int i=10;
	{
		m1();
		System.out.println("Parent Instance Block");
	}
	Parent()
	{
		System.out.println("Parent Constructor");
	}
	static public void main(String... Kuntan)
	{
		Parent p = new Parent();
		System.out.println("Parent Main");
	}
	public void m1()
	{
		System.out.println(j);
	}
	int j=20;
}

class Child extends Parent
{
	int x=100;
	{
		m2();
		System.out.println("Child First Instance Block");
	}
	Child()
	{
		System.out.println("Child Constructor");
	}
	static public void main(String... Kuntan)
	{
		Child c = new Child();
		System.out.println("Child Main");
	}
	public void m2()
	{
		System.out.println(y);
	}
	{
		System.out.println("Child Second Instance Block");
	}
	int y=200;
}