// While resolving overloaded methods compiler will always give precedence for child type argument; when compared with parent type argument
class Alert4
{
	public void m1(String s)
	{
		System.out.println("String Version");
	}
	public void m1(Object o)
	{
		System.out.println("Object Version");
	}
	
	public static void main(String[] args)
	{
		Alert4 alt = new Alert4();
		alt.m1("kuntan");
		alt.m1(new Object());
		alt.m1(null);
	}
}