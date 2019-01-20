import java.util.*;

class VectorDemo
{
	static public void main(String... Kuntan)
	{
		Vector v = new Vector();
		System.out.println(v.capacity());
		
		for(int i=0; i<10; i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());
		
		v.addElement("A");
		System.out.println(v.capacity());
		System.out.println(v);
		
		v.add(2,"50");
		v.add(60);
		System.out.println(v);
		
		v.remove("50");
		System.out.println(v);
		
		v.removeElement(8);
		v.remove(7);
		System.out.println(v);
	}
}