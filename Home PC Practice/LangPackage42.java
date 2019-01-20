class AutoboxingAutounboxingDemo  
{
	public static void methodOne(Integer i)             	
	{
		System.out.println("Autoboxing");
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
