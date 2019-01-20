class StringDemo 
{
	public static void main(String[ ] args) 
	{ 
		String s1=new String("ashok"); 
		String s2=s1.toString( );
		String s3=s1.toUpperCase( );
 		String s4=s1.toLowerCase( );
		String s5=s1.toUpperCase( );
		String s6=s3.toLowerCase( );
		System.out.println(s1==s6); 	// false
		System.out.println(s3==s5); 	// false
	}
}

