class AutoboxingAutounboxingDemo
{
	static Integer I=10;
	public static void main(String[] args)
	{ 
		int i=I;	//After compilation it will become "int i=I.intValue();"
		m1(i);
	}
	public static void m1(Integer I)
	{
		int k=I;
		System.out.println(k); // 10
	}
}
