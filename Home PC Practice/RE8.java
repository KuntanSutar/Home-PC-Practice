// Write a program to check if Email ID is valid or not?

import java.util.regex.*;

class Test
{
	static public void main(String... Kuntan)
	{
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z]+([.][a-zA-Z]+)+");	
		Matcher m = p.matcher(Kuntan[0]);
		
		if(m.find() && m.group().equals(Kuntan[0]))
		{
			System.out.println("Valid Mail ID!");
		}
		else
		{
			System.out.println("Invalid Mail ID!");
		}
	}
}