class Test
{
	public static void main(String[] args)
	{
		final StringBuffer sb=new StringBuffer("ashok");
		sb.append("software");
		System.out.println(sb);//ashoksoftware
		//sb=new StringBuffer("solutions");//C.E: cannot assign a value to final variable sb
		
		final String str1=new String("Kuntan");
		String str2=str1.concat("Technologies");
		System.out.println(str2);
	}
}
