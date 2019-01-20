// Very wrong conceptualization in your mind or wrong coding habbit; please remove it as early as possible.
abstract class P 
{
    public abstract void m1();
}
abstract class C extends P
{
    public abstract void m1();
}
abstract class GC extends C
{
    public abstract void m1();
}
class GCC extends GC
{
    public void m1()
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args)
	{
		P p = new P();		// abstract class can't be instantiated
		p.m1();
	}
}