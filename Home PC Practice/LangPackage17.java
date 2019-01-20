class StringBufferDemo 
{
	public static void main(String[ ] args)               	
	{
		StringBuffer sb=new StringBuffer("saicharankumxyz");
 		System.out.println(sb); // saicharankumxyz
		sb.delete(5,13);
		System.out.println(sb); // saichyz
		sb.deleteCharAt(5);
		System.out.println(sb); // saichr
 	}
}
