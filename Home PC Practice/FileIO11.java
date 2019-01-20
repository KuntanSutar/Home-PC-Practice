// PrintWriter Example 1
import java.io.*;

class PrintWriterDemo 
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter pw = new PrintWriter("uvw.txt");
		pw.write(68);
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.println("Durgasoft");
		pw.flush();
		pw.close();
	}
}
