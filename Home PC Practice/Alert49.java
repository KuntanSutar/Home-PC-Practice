// j is local variable in try block
class Alert49
{
	public static void main(String[] args)
	{
		try
		{
			int j = Integer.parseInt("ten");
		}
		catch(NumberFormatException e)
		{
			j=10;
			// System.out.println("Catch block fired!");
		}
		System.out.println(j);
	}
}