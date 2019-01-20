class StringBufferDemo 
{
	public static void main(String[ ] args) 
	{ 
		StringBuffer sb=new StringBuffer("ashok");
		System.out.println(sb.capacity( )); // 21 
		sb.append("abcdefghijklmnopqrstuv");
		System.out.println(sb.capacity( )); // 44
	}
}
