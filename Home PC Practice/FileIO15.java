// Write a program to perform file merge operation where merging should be performed line by line alternatively : Approach 2


import java.io.*;

class Test
{
	public static void main(String[ ] args) throws IOException
	{
		PrintWriter pw = new PrintWriter("File4.txt");
		BufferedReader br1 = new BufferedReader(new FileReader("File1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("File2.txt"));
		
		String line1 = br1.readLine( );
		String line2 = br2.readLine( );
		
		while(line1!=null || line2!=null)
		{
			pw.println(line1);
			pw.println(line2);
			line1=br1.readLine( );
			line2=br2.readLine( );
		}
		pw.close( );
		br1.close( );
		br2.close( );
	}
}