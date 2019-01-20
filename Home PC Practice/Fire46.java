// We can use super() or this(), only inside a constructor. If we are trying to use outside of constructor, we will get CE

class Test
{
	public void m1()		// It is method; not a construcutor 
	{
		super();	
		System.out.println("Hello");
	}
	static public void main(String... Kuntan)
	{
		
	}
}