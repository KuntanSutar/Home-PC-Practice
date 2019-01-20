class Animal
{
}

class Monkey extends Animal
{
}

class Alert7
{
	public void m1(Animal a)
	{
		System.out.println("Animal Version");
	}
	
	public void m1(Monkey m)
	{
		System.out.println("Monkey Version");
	}
	
	public static void main(String[] args)
	{
		Alert7 alt = new Alert7();
		Animal a1 = new Animal();
		alt.m1(a1);
		
		Monkey m = new Monkey();
		alt.m1(m);
		
		Animal a2 = new Monkey();	// In overloading method resolution is always takes care by compiler; based on reference type.
		alt.m1(a2);					// In overloading runtime objects won't play any role.
	}
}