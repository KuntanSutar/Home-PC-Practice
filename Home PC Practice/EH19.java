class EH19 extends RuntimeException
{
	static public void main(String... Kuntan)
	{
		throw new EH19();	// It will throw runtime exception of class EH19 as it extends RuntimeException
	}
}