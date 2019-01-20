// FileWriter Example 1
// Overwriting Operation:

import java.io.*;

class FileWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("mno.txt");
		fw.write(68);	// Adding a single character
		fw.write("urga\nSoftware Solutions");	// Adding a String
		fw.write('\n');
		char[] ch={'a','b','c'};
		fw.write(ch);	// Adding a array of characters
		fw.write('\n');
		fw.flush();		// To check if any data is stucked into FileWriter or not?
		fw.close();		// For closing FileWriter
	}
}