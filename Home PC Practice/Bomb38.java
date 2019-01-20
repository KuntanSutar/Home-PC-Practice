class Bomb38
{
	static public void main(String... Kuntan)
	{ 
		int x=0;
		do
		{
			x++;
			System.out.println(x);
			if(++x < 5)
				continue;
			x++;
			System.out.println(x);
		}
		while(++x<10);
	}
}