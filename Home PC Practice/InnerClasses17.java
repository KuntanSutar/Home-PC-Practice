class Outer
{
	int x=10;
	static int y=20;
	static class Nested
	{
		public void m1()
		{
			System.out.println(x); 	// CE: non-static variable x can't be referenced from static context 
			System.out.println(y);	
		}
	}
	static public void main(String... Kuntan)
	{
		Nested n1 = new Nested();
		n1.m1();	
	}
}