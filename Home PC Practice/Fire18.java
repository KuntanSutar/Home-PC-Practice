// Whenever we are creating child class's object; parent class's object won't be created; just a parent class's constructor will be executed for child class's object purpose only

class P
{
	P()
	{
		System.out.println(this.hashCode());
	}
}

class C extends P
{
	C()
	{
		System.out.println(this.hashCode());
	}
}

class Fire18
{
	static public void main(String... Kuntan)
	{
		C c = new C();
	}
}