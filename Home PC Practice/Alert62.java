// It is Method Hidding. Not a Method Overriding.
class Alert62
{
	public static void main(String[] args)
	{
		System.out.println("Parent Main");
	}
}
class Child1 extends Alert62
{
	public static void main(String[] args)
	{
		System.out.println("Child Main");
	}
}