class Bomb95
{
	final int x;
	public void m1()
	{
		x=10;		// final instance variable can be initialized only before constructor completion i.e 
					// 1) At time of declaration
					// 2) Inside instance block
					// 3) Inside constructor : also possible
					// Here we will get CE
	}
}