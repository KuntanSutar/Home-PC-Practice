class Test extends RuntimeException
{
	public void m1() throws Test
	{
	
	}
	
	public static void main(String[] args)
	{
		Test t = new Test();
		t.m1();
	}
}
