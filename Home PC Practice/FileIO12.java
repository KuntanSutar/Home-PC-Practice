// Write a program to perform File merge (combine) operation: Approach 1

import java.io.*;

class Test
{
	public static void main(String[ ] args) throws IOException
	{
		File f = new File("File3.txt");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		BufferedReader br = new BufferedReader(new FileReader("File1.txt"));
		
		String line = br.readLine( );
		while(line!=null)
		{
			bw.write(line);
			bw.newLine( );
			line=br.readLine( );
		}
		
		br = new BufferedReader(new FileReader("File2.txt"));
		
		line = br.readLine( );
		while(line!=null)
		{
			
			bw.write(line);
			bw.newLine( );
			line=br.readLine( );
		}
		bw.close( );
		br.close( );
	}
}
