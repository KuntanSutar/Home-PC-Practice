import java.util.*;
class LinkedListDemo
{
	static public void main(String... Kuntan)
	{
		LinkedList ll = new LinkedList( );
		ll.add("durga");
		ll.add(30);
		ll.add(null);
		ll.add("durga");
		
		ll.set(0,"software");
		ll.add(0,"venkey");
		ll.addFirst("ccc");
		System.out.println(ll);		// [ccc, venkey, software, 30, null, durga]
		ll.removeLast( );
		System.out.println(ll);		// [ccc, venkey, software, 30, null]
		ll.addLast("The End");
		System.out.println(ll);		// [ccc, venkey, software, 30, null, The End]
		ll.remove("ccc");
		System.out.println(ll);		// [venkey, software, 30, null, The End]
		
		Object obj = ll.set(1,'Z');
		String str2=(String)obj;
		System.out.println(str2);	// software
		System.out.println(ll);		// [venkey, Z, 30, null, The End]

		ArrayList al = new ArrayList();
		al.add("Slim Shady");
		al.add("Eminem");
		ll.addAll(al);
		System.out.println(ll);		// [venkey, Z, 30, null, The End, Slim Shady, Eminem]
	}
}
