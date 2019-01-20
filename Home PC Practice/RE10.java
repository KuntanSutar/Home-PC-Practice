// Write a program to print all valid Email IDs present in given File, where Email IDs are mixed with normal text data.

import java.util.regex.*;
import java.io.*;

class Test
{
	static public void main(String... Kuntan) throws Exception
	{
		PrintWriter pw = new PrintWriter("ValidEmailIDs.txt");
		BufferedReader br = new BufferedReader(new FileReader("ExtractValidEmailIDs.txt"));
		Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z]+([.][a-zA-Z]+)+");
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