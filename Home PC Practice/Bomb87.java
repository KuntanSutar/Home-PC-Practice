package pack1;
public class Bomb87		
{
	protected void m1()
	{
		System.out.println("class Bomb87 method");
	}
}

class Bomb88 extends Bomb87
{
	static public void main(String... Kuntan)
	{
		Bomb87 bomb1 = new Bomb87();
		bomb1.m1();
		Bomb88 bomb2 = new Bomb88();
		bomb2.m1();
		Bomb87 bomb3 = new Bomb88();
		bomb3.m1();
	}	
} 