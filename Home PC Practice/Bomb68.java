final class Bomb68		// If class is declared as final; then we can't extend functionality of that class
{
	public void property()		
	{
		System.out.println("Cash+Land+Gold");
	}
	public final void marry()	// Because when we declare class as final; every method present inside that class gets final by dafault
	{
		System.out.println("Laxmi");
	}
}

class Bomb69 extends Bomb68
{
	public void marry()			 
	{
		System.out.println("3sha or 9tara or Jerry");
	}
}