import java.util.*;
class Test
{
	public static void main(String args[])
	{
		Locale l1=Locale.getDefault();
		System.out.println(l1.getCountry()+"....."+l1.getLanguage());
		System.out.println(l1.getDisplayCountry()+"....."+l1.getDisplayLanguage());		
		Locale l2=new Locale("Marathi","IN");		
		Locale.setDefault(l2);	
		System.out.println(Locale.getDefault().getCountry()+"....."+Locale.getDefault().getLanguage());
		
		String[] s3=Locale.getISOLanguages();		
		for(String s4:s3)		
		{		
			System.out.println("ISO language is:"+s4);	
		}	
		
		String[] s4=Locale.getISOCountries();		
		for(String s5:s4)		
		{		
			System.out.println("ISO Country is:"+s5);		
		}
		
		Locale[] s=Locale.getAvailableLocales();
		for(Locale s1:s)
		{
			System.out.println("Available locales is:"+s1); 
			System.out.println(s1.getDisplayCountry()+"......"+s1.getDisplayLanguage());
		}
	}
}
