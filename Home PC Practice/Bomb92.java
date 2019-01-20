// Your wrong conceptualization
class Bomb92
{
	int x;
	final int y;			// final variable compulsory we have to perform initialization explicitely whether we are using or not!
	static int z;
	static public void main(String... Kuntan)
	{
		Bomb92 bomb1 = new Bomb92();
		System.out.println(bomb1.x);
		System.out.println(bomb1.y);
		System.out.println(z);	// static variables can be accessed in static context directly
	}	
}