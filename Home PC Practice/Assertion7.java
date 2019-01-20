// Check output by enabling & disabling the assertions

class Test
{
	static public void main(String... Kuntan)
	{
		boolean assertOn = true;
		assert(assertOn):assertOn=false;
		if(assertOn)
		{
			System.out.println("assertOn");
		}
	}
}