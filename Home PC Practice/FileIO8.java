// FileReader Example 2

import java.io.*;

class FileReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		File f = new File("mno.txt");
		FileReader fr = new FileReader(f);
		char[] chs = new char[(int)f.length()];
		fr.read(chs);
		for(char ch:chs)
		{
			System.out.print(ch);
		}
		fr.close();
	}
}

/*
What if length of File is greater than 2,147,483,647 i.e int's range?
Then use previous approach FileIO7.java; as you can specify the length of array only in int type.
*/