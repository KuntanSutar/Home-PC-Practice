// Write a program to display all file names having specific extension present in C:\Users\Sutar

import java.util.regex.*;
import java.io.*;

class Test
{
	static public void main(String... Kuntan) throws Exception
	{
		int count = 0;
		File f = new File("C:\\Users\\Sutar");
		PrintWriter pw = new PrintWriter("AllTextFileNames.txt");
		Pattern p = Pattern.compile("[a-zA-Z0-9._$]+[.](java|class)");
		String[] files = f.list();
		for(String file:files)
		{
			Matcher m = p.matcher(file);
			if(m.find() && m.group().equals(file))
			{
				System.out.println(file);
				count++;
				pw.println(file);
				pw.flush();
			}
		}
		System.out.println("Total number of text files is:"+count);
	}
}