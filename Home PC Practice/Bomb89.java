// Your wrong conceptualization 
package pack2;
import pack1.Bomb87;

class Bomb89 extends Bomb87
{
	static public void main(String... Kuntan)
	{
		//Bomb87 bomb1 = new Bomb87(); 	 Here; you should use child class (i.e Bomb89) reference 
		//bomb1.m1();
		Bomb89 bomb2 = new Bomb89(); 	  
		bomb2.m1();
		//Bomb87 bomb3 = new Bomb89(); 	 This won't work as reference variable is of parent type
		//bomb3.m1();
	}
}