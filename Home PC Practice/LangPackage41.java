class AutoboxingAutounboxingDemo  
{
	public static void methodOne(long l)  
	{
 		System.out.println("Widening");
 	}
	public static void methodOne(int... i)                	
	{
		System.out.println("Var-Arg method");
 	}
 	public static void main(String[ ] args)  
	{
 		int x=10;
 		methodOne(x);
	} 
}
