class StringBufferDemo 
{
	public static void main(String[] args) 
	{ 
		StringBuffer sb=new StringBuffer("saiashokkumarreddy");
		System.out.println(sb.length( )); // 18 
		System.out.println(sb.capacity( )); // 34 
		System.out.println(sb.charAt(14)); // e 
		System.out.println(sb.charAt(30)); // RE: StringIndexOutofBoundsException
	}
}
