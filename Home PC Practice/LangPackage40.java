class AutoboxingAutounboxingDemo 
{
	public static void methodOne(long l) 
	{
		System.out.println("Widening");
	}
	public static void methodOne(Integer i) 
	{
		System.out.println("Autoboxing");
	}
	public static void main(String[ ] args) 
	{
		int x=10;
		methodOne(x);
	}
}
