// Write a program to check if mobile number is valid or not?

import java.util.regex.*;

class Test
{
	static public void main(String... Kuntan)
	{
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");	// MF here "OR" symbol ("|") is used. It is not Forward Slash ("/"). 
		Matcher m = p.matcher(Kuntan[0]);
		
		if(m.find() && m.group().equals(Kuntan[0]))
		{
			System.out.println("Valid Number!");
		}
		else
		{
			System.out.println("Invalid Number!");
		}
	}
}