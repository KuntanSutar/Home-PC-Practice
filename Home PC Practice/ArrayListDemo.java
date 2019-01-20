import java.util.*;
class ArrayListDemo
{
public static void main(String[] args)
{
	ArrayList al = new ArrayList();
	al.add(10);
	al.add('A');
	al.add(10);
	al.add(null);
	System.out.println(al);
	al.remove(2);
	al.add(2,'M');
	System.out.println(al);
	al.add('N');
	System.out.println(al);
}
}