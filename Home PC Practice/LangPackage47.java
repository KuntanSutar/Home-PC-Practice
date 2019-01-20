// To use == operator compulsory there should be some relation between argument types (P-C, C-P, same type).
// Otherwise CE saying incomparable types.
// If there is no relation between argument types; then .equals() method won't rise CE or RE; simple it returns false.

class LangPackageDemo  
{
	public static void main(String[ ] args) 
	{ 
		String str1= new String("kuntan");
		String str2= new String("kuntan");
		StringBuffer sb1= new StringBuffer("kuntan");
		StringBuffer sb2= new StringBuffer("kuntan");
		System.out.println(str1==str2);			// false
		System.out.println(str1.equals(str2));	// true
		System.out.println(sb1==sb2);			// false
		System.out.println(sb1.equals(sb2));	// false
		//System.out.println(str1==sb1);	C.E: incomparable types: String & StringBuffer
		System.out.println(str1.equals(sb1));	// false
	} 
}