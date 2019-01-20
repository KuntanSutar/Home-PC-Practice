class StringBufferDemo 
{
	public static void main(String[] args)                	
	{
		StringBuffer sb = new StringBuffer( ); 
		sb.append("ashok").insert(5,"arunkumar").delete(11,13).reverse( ).append("solutions").insert(18,"abcdf").reverse( );
		System.out.println(sb); // snofdcbaitulosashokarunkur
	}
}
