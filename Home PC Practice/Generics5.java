// To provide compatibility with old versions, SUN people compromised in the concept of generics in very few area's like following

import java.util.*;

class Test
{
	public static void methodOne(ArrayList al)
	{
		al.add(10);
		al.add(10.5);
		al.add(true);
	}
	
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("A");
		//al.add(10);	// C.E: cannot find symbol, method add(int)
		//al.add(10.5);	// C.E: cannot find symbol, method add(double)
		methodOne(al);
		System.out.println(al);	//[A, 10, 10.5, true]
	}
}
