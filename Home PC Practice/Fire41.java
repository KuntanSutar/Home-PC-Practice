// 1. Static Control Flow
// 2. Instance Control Flow

class Fire41
{
	public static String m1(String msg)
	{
		System.out.println(msg);
		return msg;
	}
	static String m=m1("1");
	{
		m=m1("2");
	}
	static
	{
		m=m1("3");
	}
	static public void main(String... Kuntan)
	{
		Object o = new Fire41();
	}
}  