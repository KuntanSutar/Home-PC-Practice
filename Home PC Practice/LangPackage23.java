class WrapperClassDemo  
{
	public static void main(String[ ] args)throws Exception 
	{
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		System.out.println(i1); // 10 
		System.out.println(i1.toString( )); // 10 
		System.out.println(i1.equals(i2)); // true
	}
}
