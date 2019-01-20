// If we apply any arithmetic operator between any 2 variables a & b; then resultant type is given by max(int, type of a, type of b)
class Alert65
{
	public static void main(String[] args)
	{
		byte a=10;
		byte b=20;
		byte c=(byte)(a+b);
		System.out.println(c);
	}
}