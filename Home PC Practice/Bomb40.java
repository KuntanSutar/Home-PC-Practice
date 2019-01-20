// At Runtime:
// java Bomb40 : NoClassDefFoundError:Bomb40
// java A : A class main
// java B : B class main
// java C : C class main
// java D : NoSuchMethodError:main

class A
{
	static public void main(String... Kuntan)
	{ 
		System.out.println("A class main");
	}
}

class B
{
	static public void main(String... Kuntan)
	{ 
		System.out.println("B class main");
	}
}

class C
{
	static public void main(String... Kuntan)
	{ 
		System.out.println("C class main");
	}
}

class D
{
}