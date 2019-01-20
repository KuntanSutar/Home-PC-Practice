class Alert57
{
	public static void m1(int... x)
	{
		System.out.println("Var-Arg Method");
	}
	public static void m1(int x)
	{
		System.out.println("General Method");
	}
	public static void main(String[] args)
	{
		m1(10);
		m1();
		m1(10,20);
	}
}