class Animal
{
	public void m1(Animal a)
	{
		System.out.println("Animal Version");
	}
}
class Monkey extends Animal
{
	public void m1(Monkey m)
	{
		System.out.println("Monkey Version");
	}
}
class Test extends Monkey
{
	/*
	public void m1(Animal a)
	{
		System.out.println("Animal Version");
	}
	public void m1(Monkey m)
	{
		System.out.println("Monkey Version");
	}
	*/
	static public void main(String... Kuntan)
	{
		Test t = new Test();
		
		/*
		Animal a1 = new Animal();
		t.m1(a1);
		
		Monkey m = new Monkey();
		t.m1(m);
		*/
		
		Animal a2 = new Monkey();
		t.m1(a2);
	}
}