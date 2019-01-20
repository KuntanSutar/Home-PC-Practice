// Write a program to perform file merge operation where merging should be performed line by line alternatively : Approach 1
// It is not working if two files have different number of lines
 
import java.io.*;

class Test
{
	public static void main(String[ ] args) throws IOException
	{
		File f = new File("File4.txt");
		
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		BufferedReader br1 = new BufferedReader(new FileReader("File1.txt"));
		BufferedReader br2 = new BufferedReader(new FileReader("File2.txt"));
		
		String line1 = br1.readLine( );
		String line2 = br2.readLine( );
		
		while(line1!=null && line2!=null)
		{
			bw.write(line1);
			bw.newLine( );
			line1=br1.readLine( );
			bw.write(line2);
			bw.newLine( );
			line2=br2.readLine( );
		}
		bw.close( );
		br1.close( );
		br2.close( );
	}
}
