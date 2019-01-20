// Equality operator
class Alert72
{
	public static void main(String[] args)
	{
		System.out.println(10==20);				
		System.out.println('a'=='b');		
		System.out.println('a'==97.0);		
		System.out.println(false==false);	
		Thread t1 = new Thread();
		Thread t2 = new Thread();
		Thread t3=t1;
		System.out.println(t1==t2);			// Can be used for object/reference/address comparison
		System.out.println(t1==t3);	
		
		Thread t4 = new Thread();
		Object o = new Object();
		String s = new String("Kuntan");
		System.out.println(t4==o);		
		System.out.println(s==o);
		System.out.println(s==t4);
	}
}