// Even though it is legal catch AssertionError using try-catch block, but it is not a good programming practice.

class Test 
{
	public static void main(String[] args)
	{ 
		int x=10;
		try 
		{
			assert(x>10);
		}
		catch (AssertionError e)  
		{
			System.out.println("I am stupid, because I am catching AssertionError");
		}
		System.out.println(x);
	}
}
