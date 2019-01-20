final class Bomb70
{
	static int x=10;		//  When we declare class as final; every variable present inside that class need not be final
	static public void main(String... Kuntan)
	{
		x=777;				//  Hence, as variable is not final; reassignament is possible 
		System.out.println(x);
	}
}