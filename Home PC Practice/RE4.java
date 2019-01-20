import java.util.regex.*;

class Test
{
	public static void main(String[] args)
	{
		String s="www.kuntansutar.com";
		String[] s1=s.split("\\.");	// String class split() method can take regular expression as argument; 
									// whereas Pattern class split() method can take target string as argument.
		for(String s2:s1)
		{
			System.out.println(s2);
		}
	}
}
