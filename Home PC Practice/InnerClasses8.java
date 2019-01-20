class Test
{
	int x=10;
	public void methodOne()
	{
		int y=20;
		class Inner
		{
			public void methodTwo()
			{
				System.out.println(x); //10
				//y=200; y is Effective final variable. Hence, reassignment can't be possible.
				System.out.println(y); //C.E: local variable y is accessed from within inner class; needs to be declared final.
			}
		}
		Inner i=new Inner();
		i.methodTwo();
	}
	public static void main(String[] args)
	{
		Test t = new Test();
		t.methodOne();
	}
}

// From Method Local Inner Class we can't access local variables of the method in which we declared it. But, if that local variable is declared as final, then we won't get any CE.
// This rule is applicable only till 1.7 V. From 1.8 V it is allowed to access local variables of the method from it’s Inner Class.
// Java 1.8 V introduced a New Term : Effectively final variables. A variable which is not declared as final but whose value is never changed after initialization is effectively final. 
// Internal Reason : Inner Class Part-2 : 1.09.18
// After completion of methodOne( ) for the first time, local variables of it will be destroyed automatically by GC. But, object 't' still exist inside Heap memory. By using that object we can call Inner Class’s methodTwo( ) method again. Then, at this time from where will you print 'y'; because it is already destroyed by GC. 
// But, in case if we declare variable 'y' as final, then Line 1 will be converted to System.out.println(20); at the time of Compile Time only. Hence, there will be no dependency on Inner Class's method's [i.e methodOne( )] local variable y.
