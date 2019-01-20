// If 2 objects are equal by .equals( ) method; compulsory their hashcodes must be equal or same. i.e 2 equivalent objects should have same hashcode. 

class LangPackageDemo  
{
	public static void main(String[ ] args) 
	{ 
		String str1= new String("kuntan");
		String str2= new String("kuntan");
		System.out.println(str1.equals(str2));	// true
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());
		
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(obj1.equals(obj2));
		
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
		
		StringBuffer sb1 = new StringBuffer("kuntan");
		StringBuffer sb2 = new StringBuffer("kuntan");
		System.out.println(sb1.equals(sb2));
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
	} 
}