import java.util.*;
import java.io.Serializable;
class ArrayListDemo
{
	static public void main(String... Kuntan)
	{
		ArrayList al = new ArrayList();
		al.add("A");
		al.add(10);
		al.add("A");
		al.add(null);
		System.out.println(al);		// [A, 10, A, null]
		
		al.remove(2);
		System.out.println(al);		// [A, 10, null]
		
		al.add(2,"M");
		al.add("N");
		System.out.println(al);		// [A, 10, M, null, N]
		
		Object obj = al.set(2,"Z");
		String str2=(String)obj;
		System.out.println(str2);	// M
		System.out.println(al);		// [A, 10, Z, null, N]
		
		System.out.println(al.size());	// 5
		//System.out.println(al.capacity());	No such method
		//al.set(6,"Kuntan");
		//al.add(7,"Sutar");
		
		al.remove("A");
		System.out.println(al);		// [10, Z, null, N]
		
		LinkedList ll = new LinkedList();
		ll.add("Z");
		ll.add("Slim Shady");
		ll.add("Marshal Mathers");
		
		al.addAll(ll);
		System.out.println(al);		// [10, Z, null, N, Z, Slim Shady, Marshal Mathers]
		
		ArrayList al1 = new ArrayList();
		LinkedList ll1 = new LinkedList();
		System.out.println(al1 instanceof Serializable);	// true
		System.out.println(al1 instanceof Cloneable);		// true
		System.out.println(ll1 instanceof Serializable);	// true
		System.out.println(ll1 instanceof Cloneable);		// true
		System.out.println(al1 instanceof RandomAccess);	// true
		System.out.println(ll1 instanceof RandomAccess);	// false
	}
}