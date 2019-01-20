import java.lang.reflect.*;

class Test
{
	static public void main(String... Kuntan)
	{
		int count=0;
		Object o = new String("Kuntan");
		Class c = o.getClass();
		System.out.println("Fully Qualified Name of Class:"+c.getName());
		Method[] m = c.getDeclaredMethods();
		System.out.println("Methods Information:");
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("Total Number of Methods:"+count);
	}
}