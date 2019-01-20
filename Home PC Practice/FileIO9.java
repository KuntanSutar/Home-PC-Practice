// BufferedWriter Example 1

import java.io.*;

class BufferedWriterDemo
{
	public static void main(String[ ] args) throws IOException
	{
		FileWriter fw = new FileWriter("cricket.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write(68);
		bw.newLine( );
		char[ ] ch={'a','b','c','d'};
		bw.write(ch);
		bw.newLine( );
		bw.write("Durga");
		bw.newLine( );
		bw.write("Software Solutions");
		bw.flush( );
		bw.close( );
	}
}
