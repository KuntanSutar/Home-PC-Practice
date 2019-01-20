import java.util.*;

class StackDemo
{
	static public void main(String... Kuntan)
	{
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.add("Kuntan");
		s.set(2,"Sutar");
		s.add(1,"Prasad");
		System.out.println(s);	// [A, Prasad, B, Sutar, Kuntan]
		System.out.println(s.capacity());	// 10
		s.push("A");
		s.push("B");
		s.push("C");
		s.add("Kuntan");
		s.push("A");
		s.push("B");
		s.push("C");
		s.add("Kuntan");
		System.out.println(s);	// [A, Prasad, B, Sutar, Kuntan, A, B, C, Kuntan, A, B, C, Kuntan]
		System.out.println(s.capacity());	// 20	
		
		ArrayList al1 = new ArrayList();
		al1.add("B");
		al1.add("Sutar");
		al1.add("Kuntan");
		
		s.removeAll(al1);
		System.out.println(s);				// [A, Prasad, A, C, A, C]
		System.out.println(s.search("A"));	// 2
		System.out.println(s.search("Z"));	// -1
		System.out.println(s.isEmpty());	// false
		
		Object obj=s.push("X");
		String str=(String)obj;
		System.out.println(str);	// X
		
		ArrayList al2 = new ArrayList();
		al2.add("A");
		al2.add("Prasad");
		System.out.println(s.containsAll(al2));	// true
	}
}