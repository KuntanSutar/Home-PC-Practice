class OurOwnGenericClass<T>
{
	T obj;
	OurOwnGenericClass(T obj)
	{
		this.obj=obj;
	}
	
	public void show()
	{
		System.out.println("Type of obj is:"+obj.getClass().getName());
	}
	
	public T getObj()
	{
		return obj;
	}
}

class Test
{
	static public void main(String... Kuntan)
	{
		OurOwnGenericClass<String> oogc1 = new OurOwnGenericClass<String>("Durga");
		oogc1.show();							// Type of obj is:java.lang.String
		System.out.println(oogc1.getObj());		// Durga
		
		OurOwnGenericClass<Integer> oogc2 = new OurOwnGenericClass<Integer>(10);
		oogc2.show();							// Type of obj is:java.lang.Integer
		System.out.println(oogc2.getObj());		// 10
		
		OurOwnGenericClass<Double> oogc3 = new OurOwnGenericClass<Double>(10.5);
		oogc3.show();							// Type of obj is:java.lang.Double
		System.out.println(oogc3.getObj());		// 10.5
		
		/* 
			Collection concept applicable only for Objects; hence for the Parameter type we can use only Class or Interface types. But we can't use primitive types
			OurOwnGenericClass<double> oogc4 = new OurOwnGenericClass<double>(10.5);
			oogc4.show();
			System.out.println(oogc4.getObj());
		*/
	}
}







