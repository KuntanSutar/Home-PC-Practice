import java.util.*;
import java.io.*;

class Test
{
	//We can use this method for ArrayList of String type only. Within the method we can add only String type Objects & null. 
	public static void m1(ArrayList<String> al)
	{
		al.add("Marshal Mathers");
		al.add("Slim Shady");
		al.add("Bad Meets Evil");	
		al.add(null);	// null is allowed, because it is valid value for any type
	}
	
	//We can use this method for ArrayList with any type parameter; but within the method we can't add anything to the ArrayList except null.
	public static void m2(ArrayList<?> al)
	{
		//al.add("Marshal Mathers");
		//al.add("Slim Shady");
		//al.add(10);
		//al.add(10.5f);
		al.add(null);	// null is allowed, because it is valid value for any type
	}
	
	//We can use this method only for ArrayList with any type parameter; which is Child class of Number. 
	//Within the method we can't add anything to the ArrayList except null.
	public static void m3(ArrayList<? extends Number> al)
	{
		//al.add("Marshal Mathers");
		//al.add("Slim Shady");
		al.add(null);	// null is allowed, because it is valid value for any type
	}
	
	//We can use this method only for ArrayList with Integer as type parameter & it's super classes (i.e Number, Object)
	//Otherwise CE.
	public static void m4(ArrayList<? super Integer> al)
	{
		//al.add("Marshal Mathers");
		//al.add("Slim Shady");
		al.add(null);	// null is allowed, because it is valid value for any type
		al.add(345);
	}
	
	//We can use this method only for ArrayList with B as type parameter or it's super classes
	//Otherwise CE.
	public static void m5(ArrayList<? super B> al)
	{
		//al.add("Marshal Mathers");
		//al.add("Slim Shady");
		//al.add(345);
		al.add(null);	// null is allowed, because it is valid value for any type
	}
	
	//We can use this method only for ArrayList with Runnable as type parameter or super classes (i.e Object) of it's implementation classes (i.e Thread, etc) 
	//Otherwise CE.
	public static void m6(ArrayList<? super Runnable> al)
	{
		Runnable r= new Thread();
		//al.add("Marshal Mathers");
		//al.add("Slim Shady");
		//al.add(345);
		al.add(r);
		al.add(null);	// null is allowed, because it is valid value for any type
	}
	
	/*
	This type of terminology is not there.
	public static void m7(ArrayList<? super Serializable, Cloneable> al)
	{
		//al.add("Marshal Mathers");
		//al.add("Slim Shady");
		//al.add(345);
		al.add(null);	// null is allowed, because it is valid value for any type
	}
	*/
	
	static public void main(String... Kuntan)
	{
		ArrayList<String> al1 = new ArrayList<String>();
		m1(al1);
		System.out.println(al1);	// [Marshal Mathers, Slim Shady, Bad Meets Evil, null]
		
		// m1() method is applicable only for ArrayList<String> type parameter only
		// Hence, we will get CE.
		/*ArrayList<Integer> al2 = new ArrayList<Integer>();
		m1(al2);
		ArrayList<Float> al3 = new ArrayList<Float>();
		m1(al3);
		ArrayList<Student> al4 = new ArrayList<Student>();
		m1(al4);
		*/
		
		ArrayList<String> al5 = new ArrayList<String>();
		m2(al5);
		System.out.println(al5);	// [null]
		
		ArrayList<Integer> al6 = new ArrayList<Integer>();
		m2(al6);
		System.out.println(al6);	// [null]
		
		ArrayList<Float> al7 = new ArrayList<Float>();
		m2(al7);
		System.out.println(al7);	// [null]
		
		ArrayList<Student> al8 = new ArrayList<Student>();
		m2(al8);
		System.out.println(al8);	// [null]
		
		ArrayList<Number> al9 = new ArrayList<Number>();
		m3(al9);
		System.out.println(al9);	// [null]
		
		/*
		ArrayList<String> al10 = new ArrayList<String>();
		m3(al10);
		*/
		
		//Example<String> xmpl = new Example<String>();		? type parameter is applicable at method level.
		
		ArrayList<Number> al11 = new ArrayList<Number>();
		ArrayList<Object> al12 = new ArrayList<Object>();
		ArrayList<Integer> al13 = new ArrayList<Integer>();		
		m4(al11);
		m4(al12);
		m4(al13);
		System.out.println(al11);	// [null, 345]
		System.out.println(al12);	// [null, 345]
		System.out.println(al13);	// [null, 345]
		
		ArrayList<A> al14 = new ArrayList<A>();	
		m5(al14);
		System.out.println(al14);	// [null]
		
		ArrayList<B> al15 = new ArrayList<B>();	
		m5(al15);
		System.out.println(al15);	// [null]
		
		// Method is not applicable for ArrayList with C as type parameter; because it is not a parent of B
		/*
		ArrayList<C> al16 = new ArrayList<C>();	
		m5(al16);
		System.out.println(al16);	// [null]
		*/
		
		ArrayList<Object> al17 = new ArrayList<Object>();
		ArrayList<Runnable> al18 = new ArrayList<Runnable>();
		m6(al17);
		m6(al18);
		System.out.println(al17);	// [null]
		System.out.println(al18);	// [null]
		
		
		/*
		This type of terminology is not there.
		ArrayList<Serializable, Cloneable> al19 = new ArrayList<Serializable, Cloneable>();
		ArrayList<Object> al20 = new ArrayList<Object>();
		m7(al19);
		m7(al20);
		System.out.println(al19);	
		System.out.println(al20);	
		*/
		
		String name = al1.getClass().getName();
		System.out.println(name);
		
		//Example<Number> xmpl = new Example<Number>();
	}
}

class A
{
}
class B extends A
{
}
class C extends B
{
}

// Wild Card character ? is applicable at method level.
// This type of terminology is not applicable at Class Level
/*
class Example<? extends Number>
{
}
*/