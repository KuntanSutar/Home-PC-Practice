// Inheritance concept is applicable for main() method
// While executing child class; if it doesn't contain main() method then parent class's main() method will be executed 
class Alert61
{
	public static final synchronized strictfp void main(String... Kuntan)
	{
		System.out.println("Parent Method");
	}
}
class Child1 extends Alert61
{
	
}