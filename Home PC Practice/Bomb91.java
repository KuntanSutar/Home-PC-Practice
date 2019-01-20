package pack2;
import pack1.Bomb87;

class Bomb90 extends Bomb87
{
}

class Bomb91 extends Bomb90
{
	static public void main(String... Kuntan)
	{
		// Bomb87 bomb1 = new Bomb87();		You should use child class (Bomb91) reference only; otherwise it will not be possible 
		// bomb1.m1();
		// Bomb90 bomb2 = new Bomb90();		You should use child class (Bomb91) reference only; otherwise it will not be possible 
		// bomb2.m1();
		// Bomb87 bomb3 = new Bomb90();		You should use child class (Bomb91) reference only; otherwise it will not be possible 
		// bomb3.m1();
		// Bomb87 bomb4 = new Bomb91();		You should use child class (Bomb91) reference only; otherwise it will not be possible 
		// bomb4.m1();
		// Bomb90 bomb5 = new Bomb91();		You should use child class (Bomb91) reference only; otherwise it will not be possible 
		// bomb5.m1();
		// Bomb91 bomb6 = new Bomb91();		You should use child class (Bomb91) reference only; otherwise it will not be possible 
		// bomb6.m1();
		Bomb91 bomb7 = new Bomb91();
		bomb7.m1();
	}
}