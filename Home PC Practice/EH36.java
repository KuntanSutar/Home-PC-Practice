// NumberFormatException

class EH36
{
	static public void main(String... Kuntan)
	{
		int i = Integer.parseInt("10");
		int j = Integer.parseInt("ten"); // Indicates that String is not properly formatted
	}
}