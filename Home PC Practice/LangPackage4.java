// By using heap object reference, if we want to get corresponding SCP object, then we should go for intern( ) method.

class StringDemo 
{
	public static void main(String[] args)               	
	{
		String s1=new String("bhaskar");
 		String s2=s1.intern( );
		System.out.println(s1==s2);  	 //  false
		String s3="bhaskar";
		System.out.println(s2==s3);	//   true
	}
}
