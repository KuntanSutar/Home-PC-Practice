class Alert6
{
	public void m1(int i, float f)
	{
		System.out.println("int-float version");
	}
	public void m1(float f, int i)
	{
		System.out.println("float-int version");
	}
	public static void main(String[] args)
	{
		Alert6 alt = new Alert6();
		alt.m1(10,10.5f);
		alt.m1(10.5f, 10);
		// alt.m1(10, 10);
		// alt.m1(10.5f, 10.5f);
	}
}