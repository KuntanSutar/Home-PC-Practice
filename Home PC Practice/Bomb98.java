// Formal parameters of method simply acts as local variables of that method
class Bomb98
{
	static public void main(String... args)
	{
		m1(10,20);	
	}
	public static void m1(final int x, int y)		// Here local variable x is defined as final 
	{
		x=100;										// Hence, reassignment can't be possible 
		y=200;
		System.out.println(x+"..."+y);
	}
}
