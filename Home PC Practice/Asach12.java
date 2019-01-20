class Asach12
{
	static public void main(String... Kuntan) throws Exception
	{
		String str1 = new String("Kuntan");
		String str2 = str1;			// Object references str1 & str2 are pointing to same String object "Kuntan"
		str2=str2.concat(" Sutar");	// Runtime Operation : New Object
		System.out.println(str1);	// Kuntan
		System.out.println(str2);	// Kuntan
		System.out.println(str1.hashCode());	
		System.out.println(str2.hashCode()); 	// Both hashcodes are different i.e both are different objects
	}
}