// break can only be used in for loop, switch case & labled block. Anywhere else CE.
class Bomb34
{
	static public void main(String... Kuntan)
	{ 
		int x=10;
		l1:
		{
			System.out.println("Begin");
			if(x==10)
				break l1;
			System.out.println("End");
		}
		System.out.println("Hello");
		
		int y=10;
		if(y==10)
			break;
		System.out.println("Hello");
	}
}