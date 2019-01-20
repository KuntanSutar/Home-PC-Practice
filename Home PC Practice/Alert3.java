// Automatic Promotion in Overloading
class Alert3
{
	public void m1(int i)
	{
		System.out.println("int-arg");
	}
	public void m1(float f)
	{
		System.out.println("float-arg");
	}
	
	public static void main(String[] args)
	{
		Alert3 alt = new Alert3();
		alt.m1(10);
		alt.m1(10.5f);
		alt.m1('a');
		alt.m1(10l);
		//alt.m1(10.5);
	}
}
