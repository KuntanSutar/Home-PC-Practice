// x is local variable to do.
// It will be of no use after do block
// Hence, such declarations are not allowed 
class Bomb9
{
	static public void main(String... Kuntan)
	{
		do
		int x=10;				// Variable declarations are not allowed here.
		while(true);
	}
}