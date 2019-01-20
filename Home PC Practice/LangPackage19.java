class StringBufferDemo 
{
	public static void main(String[ ] args) 
	{ 
		StringBuffer sb=new StringBuffer( );
		System.out.println(sb.capacity( )); // 16
		sb.ensureCapacity(1000); 	// On Fly size changed
		System.out.println(sb.capacity( )); // 1000 
	}
}
