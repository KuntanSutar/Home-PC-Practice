class StringBufferDemo  
{
 	public static void main(String[ ] args)
	{
		StringBuffer sb=new StringBuffer(1000);
		System.out.println(sb.capacity( )); // 1000
		sb.append("ashok");
		System.out.println(sb.capacity( )); // 1000
		sb.trimToSize( );
		System.out.println(sb.capacity( )); // 5
		System.out.println(sb.capacity( )); // 5
	}
}

