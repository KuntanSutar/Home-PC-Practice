class EH2
{
	static public void main(String... Kuntan)
	{
		doStuff();
		System.out.println(10/0);
	}
	static public void doStuff()
	{
		doMoreStuff();
		System.out.println("Hi!");
	}
	static public void doMoreStuff()
	{
		System.out.println("Hello!");
	}
}