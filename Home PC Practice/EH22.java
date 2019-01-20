class EH22
{
	static public void main(String... Kuntan)
	{
		try
		{
			Thread.sleep(10000);
		}
		catch(InterruptedException e)
		{
			// What is written inside "catch" block; compiler never checks
		}
	}
}