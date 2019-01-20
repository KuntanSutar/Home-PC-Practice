import java.util.*;
class TreeSetDemo
{
	public static void main(String[] args)
	{
	TreeSet t = new TreeSet();
	t.add('A');
	t.add('a');
	t.add('B');
	t.add('C');
	t.add('Z');
	t.add('A');
	//t.add(10);
	System.out.println(t);
	//System.out.println(t.capacity());
	}
}