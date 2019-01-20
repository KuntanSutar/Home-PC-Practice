class Second extends First
{
	Second()
	{
		System.out.println("Second");
	}
	static public void main(String... Kuntan)
	{
		Second second = new Second();	// Parent class constructor always gets executed before (compulsoryly); when instance (object) of Child class created
	}
}

class First
{
	First()
	{
		System.out.println("First");
	}
}