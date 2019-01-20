// FileWriter Example 2
// Appending Operation:

import java.io.*;

class FileWriterDemo
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw = new FileWriter("pqr.txt", true);
		fw.write(68);	// Appending a single character
		fw.write("urga\nSoftware Solutions");	// Appending a String
		fw.write('\n');
		char[] ch={'a','b','c'};
		fw.write(ch);	// Appending a array of characters
		fw.write('\n');
		fw.flush();		// To check if any data is stucked into FileWriter or not?
		fw.close();		// For closing FileWriter
	}
}