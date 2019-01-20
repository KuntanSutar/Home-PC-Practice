// static + instance control flow

class Fire39
{
	{
		System.out.println("First Instance Block");
	}
	static
	{
		System.out.println("First Static Block");
	}
	Fire39()
	{
		System.out.println("Constructor");
	}
	static public void main(String... Kuntan)
	{
		Fire39 fire1 = new Fire39();
		System.out.println("Main");
		Fire39 fire2 = new Fire39();
	}
	static
	{
		System.out.println("Second Static Block");
	}
	{
		System.out.println("Second Instance Block");
	}
}