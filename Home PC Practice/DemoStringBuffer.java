class DemoStringBuffer
{
	public static void main(String[] args)
	{
		String str1 = new String("Kuntan");
		String str2 = new String("Kuntan");
		str1.concat("Sutar");
		System.out.println(str1);
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));

		StringBuffer sb1 = new StringBuffer("Kuntan");
		StringBuffer sb2 = new StringBuffer("Kuntan");
		sb1.append("Sutar");
		System.out.println(sb1);
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
	}
}