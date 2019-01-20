class WrapperClassDemo 
{
	public static void main(String[] args)
	{
		Integer I1=Integer.valueOf("1111"); 
		System.out.println(I1); // 1111
		Integer I2=Integer.valueOf("1111",2); 
		System.out.println(I2); // 15
		Integer I3=Integer.valueOf("1111",16); 
		System.out.println(I3); // 4369
		Integer I4=Integer.valueOf("1111",17); 
		System.out.println(I4); // 5220
		Integer I5=Integer.valueOf("1111",36); 
		System.out.println(I5); // 47989
	}
}
