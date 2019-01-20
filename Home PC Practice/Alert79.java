//Conditional Operator (Ternary)
class Alert79
{
	static public void main(String... kuntan)
	{
		int x=(10<20)?30:40;
		System.out.println(x);
		int y=(10>20)?30:((40>50)?60:70);			// Nesting possible
		System.out.println(y);
	}
}