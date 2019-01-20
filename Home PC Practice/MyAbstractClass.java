abstract strictfp class MyAbstractClass
{	
	public static void main(String[] args)
	{
	public void floatSum()
	{
		float a=1.5f;
		float b=1.5f;
		float c; 
		c=a+b;
		System.out.println(c);
	}
	abstract void sum();
	}
}
class Child extends MyAbstractClass 
{
	public void sum()
	{
	float d=2.5f;
	float e=2.5f;
	float f;
	f=d+e;
	System.out.println(f);
	}
}

	 