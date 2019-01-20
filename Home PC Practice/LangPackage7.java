class StringDemo  
{
	public static void main(String[] args)
	{
		String s="ashok";
		System.out.println(s.charAt(3));	// o
		System.out.println(s.charAt(100));	// RE: StringIndexOutOfBoundsException 
											// String index out of range: 100 
	}
}
