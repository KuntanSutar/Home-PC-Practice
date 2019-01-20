import java.util.*;

class Test<T>
{
	static public void main(String... Kuntan)
	{
		ArrayList<String> al1 = new ArrayList<String>();
		al1.add("Kuntan");
		al1.add("Prasad");
		al1.add("Slim Shady");
		al1.add("Marshal Mathers");
		al1.add("10");
		//al1.add(new Integer(10));	no suitable method found for add(int)
		
		String s1=(String)al1.get(1); // This Type-Casting is not required due to Generics
		String s2=al1.get(2);
		System.out.println(s1);				// Prasad
		System.out.println(s2);				// Slim Shady
		System.out.println(al1.get(3));		// Marshal Mathers
		
		// Usage of Parent Interface reference to hold Child Class object is called Polymorphism
		List<String> l1 = new ArrayList<String>();
		Collection<String> c = new ArrayList<String>();
		
		//Polymorphism concept is applicable only for the Base type but not for Parameter type
		//List<Object> l2 = new ArrayList<String>();  		
		//ArrayList<Object> al2 = new ArrayList<String>();	
		
		// Collection concept applicable only for Objects; hence for the Parameter type we can use only Class or Interface types. But we can't use primitive types
		//List<int> l3 = new ArrayList<int>();	
		
		Test<Integer> t1 = new Test<Integer>();
		Test<String> t2 = new Test<String>();
		
		// type argument String is not within bounds (i.e Number) of type-variable T 
		//Sample<String> smpl1 = new Sample<String>();	
		
		// Following type arguments are within bounds of type-variable T
		Sample<Number> smpl2 = new Sample<Number>();
		Sample<Byte> smpl3 = new Sample<Byte>();
		Sample<Short> smpl4 = new Sample<Short>();
		Sample<Integer> smpl5 = new Sample<Integer>();
		Sample<Long> smpl6 = new Sample<Long>();
		Sample<Float> smpl7 = new Sample<Float>();
		Sample<Double> smpl8 = new Sample<Double>();
		
		Mumble<LP> mmbl = new Mumble<LP>();
		
		Namuna<Runnable> nmn1 = new Namuna<Runnable>();
		Namuna<Thread> nmn2 = new Namuna<Thread>();
		
		// type argument Integer is not within bounds of type-variable T
		//Namuna<Integer> nmn3 = new Namuna<Integer>();
		
		Item<Thug> itm = new Item<Thug>();
		
		Tukda<Number, Runnable> tkd = new Tukda<Number, Runnable>();
		
		Drank<A, B, C> drnk = new Drank<A, B, C>();
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		Thang<Bang> thng = new Thang<Bang>();
	}
}

// As the type parameter we can pass either Number or its Child classes.
class Sample<T extends Number>
{
}

// As the type parameter we can use any valid java identifier, but it conventional to use T always.
class Mumble<LP>
{
}

class LP
{
}

// We can define bounded types even in combination also
// As the type parameter we can pass only such type parameter, which should be Child class of Number & should implements Runnable Interface 
class Item<T extends Number & Runnable> 	
{
}


class Thug extends Number implements Runnable
{
	public void run()
	{
		System.out.println("Run Method");
	}
	public int intValue()
	{
		System.out.println("Int Value");
		return 10;
	}
	public long longValue()
	{
		System.out.println("Long Value");
		return 10;
	}
	public float floatValue()
	{
		System.out.println("Float Value");
		return 10.5f;
	}
	public double doubleValue()
	{
		System.out.println("Double Value");
		return 10.5;
	}
}

// We can pass any no. of type parameters based on our requirement. It should not be one compulsory.
// All these type parameters should be seperated with comma.
class Tukda<T extends Number, Runnable> 
{
}

// Based on our requirement, we can declare any no of type parameters. It should not be one compulsory; it can be in combination.
// All these type parameters should be seperated with comma.
class Drank<A, B, C>
{
}
class A
{
}
class B
{
}
class C
{
}

class Namuna<T extends Runnable>	
{
}

/* This class code is already inside collection package; written in JVM 
class HashMap<K,V>
{
}
*/

// As the type parameter we can pass only such type parameter, which extends both Runnable & Comparable Interface
class Thang<T extends Runnable & Comparable>
{
}

class Bang implements Runnable, Comparable
{
	public void run()
	{
		System.out.println("Run Method");
	}
	public int compareTo(Object obj)
	{
		return 1;
	}
}