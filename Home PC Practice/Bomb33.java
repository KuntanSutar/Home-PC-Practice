// Both for loop will produce same result 
class Bomb33
{
	static public void main(String... Kuntan)
	{ 
		for(int i=0; i<10; i++)			
		{
			System.out.println(i);
		}
		System.out.println("\n");
	
		for(int i=0; i<10; ++i)			
		{
			System.out.println(i);
		}
	}
}