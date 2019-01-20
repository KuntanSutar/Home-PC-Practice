class StringBufferDemo  
{
	public static void main(String[] args)  
	{
		StringBuffer sb=new StringBuffer(19);
		System.out.println(sb.capacity( )); // 19
		sb.append("abcdefghijklmnopqrs");
		sb.append("v");
 		System.out.println(sb.capacity( )); // 40
 	}
}
