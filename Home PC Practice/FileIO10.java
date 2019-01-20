// BufferedReader Example 1

import java.io.*;

class BufferedReaderDemo
{
	public static void main(String[ ] args) throws IOException
	{
		File f = new File("jkl.txt");
		f.createNewFile();
		FileReader fr = new FileReader(f);
		BufferedReader br = new BufferedReader(fr);
		String line=br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
	}
}