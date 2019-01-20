class Alert8
{
	public void m1(int x)
	{
		System.out.println("General Method");
	}
	public void m1(int... x)
	{
		System.out.println("Var-Arg Method");
	}
	
	public static void main(String[] args)
	{
		Alert8 alt = new Alert8();
		alt.m1();
		alt.m1(10);
		alt.m1(10, 20);
	}
}