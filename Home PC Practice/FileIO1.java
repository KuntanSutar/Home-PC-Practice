import java.io.*;

class Test
{
	static public void main(String... Kuntan) throws IOException
	{
		File f = new File("xyz.txt");
		System.out.println(f.exists());
		f.createNewFile();
		System.out.println(f.exists());
	}
}