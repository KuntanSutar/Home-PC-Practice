// As ae object is created it will not have default value null
// It will throw corresponding class's exception

class EH14
{
	static ArithmeticException ae = new ArithmeticException();
	
	static public void main(String... Kuntan)
	{
		throw ae;
	}
}