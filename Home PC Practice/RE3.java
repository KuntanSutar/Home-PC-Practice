// Alert

import java.util.regex.*;

class Test
{
	public static void main(String[] args)
	{
		Pattern p1 = Pattern.compile("\\."); // '.' means any character. If we want to tell compiler to consider '.' as symbol we have to use "\."
											// If compiler sees '\', it will consider as Escape Character, hence we will get CE saying "illegal escape character"
											// If we want to tell compiler to consider "\." as symbol we have to add '\' in it. i.e. We have to use "\\."
											
		String[] strings1 = p1.split("www.kuntansutar.com");// String class split() method can take regular expression as argument; 
															// whereas Pattern class split() method can take target string as argument.
		
		for(String string:strings1)
		{
			System.out.println(string);
		}
		
		// It can also be achieved by using '[]' symbol
		Pattern p2 = Pattern.compile("[.]");
		
		String[] strings2 = p1.split("www.kuntansutar.com");
		
		for(String string:strings2)
		{
			System.out.println(string);
		}
	}
}