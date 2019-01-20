// Write a program to print all valid mobile numbers present in given File, where mobile numbers are mixed with normal text data.

import java.util.regex.*;
import java.io.*;

class Test
{
	static public void main(String... Kuntan) throws Exception
	{
		PrintWriter pw = new PrintWriter("ValidNumbers.txt");
		BufferedReader br = new BufferedReader(new FileReader("ExtractValidMobileNumbers.txt"));
		Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
		String line = br.readLine();
		while(line!=null)
		{
			Matcher m = p.matcher(line);
			while(m.find())
			{
				pw.println(m.group());
			}
			line = br.readLine();
			pw.flush();
		}
	}
}