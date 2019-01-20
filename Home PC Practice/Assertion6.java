// Check output by enabling & disabling the assertions

class Test
{
	static public void main(String... Kuntan)
	{
		boolean assertOn = false;
		assert(assertOn):assertOn=true;
		if(assertOn)
		{
			System.out.println("assertOn");
		}
	}
}