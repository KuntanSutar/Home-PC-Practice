import java.io.*;
class Test
{
	static public void main(String... Kuntan) throws IOException
	{
		System.out.println("Console Output");
		PrintWriter pw = new PrintWriter("abc.txt");
		pw.println("File Output");
		pw.flush();
	}
}