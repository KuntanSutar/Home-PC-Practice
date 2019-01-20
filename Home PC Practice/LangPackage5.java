// If the corresponding object is not there in SCP, then intern() method itself will create that object and returns it.

class StringDemo 
{
	public static void main(String[] args)               	
	{
		String s1=new String("bhaskar");
		String s2=s1.concat("software");
		String s3=s2.intern( );
		String s4="bhaskarsoftware";
		System.out.println(s3==s4);	// true
	}
}
