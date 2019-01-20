abstract class Bomb71
{
	abstract public void show();
	static public void main(String... Kuntan)
	{
		
	}
}

class Bomb72 extends Bomb71		// This class should compulsorily override show() method
{
	public void show()
	{
		System.out.println("Hello");
	}
}

class Bomb73 extends Bomb71		// This class should compulsorily override show() method
{
	public void show()
	{
		System.out.println("Hi");
	}
}