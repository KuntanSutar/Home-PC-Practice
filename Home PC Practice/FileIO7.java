// FileReader Example 1

import java.io.*;

class FileReaderDemo
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr = new FileReader("mno.txt");
		int i = fr.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i = fr.read();
		}
		fr.close();
	}
}