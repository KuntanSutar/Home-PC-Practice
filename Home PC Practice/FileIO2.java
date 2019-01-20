import java.io.*;

class Test
{
	static public void main(String... Kuntan) throws IOException
	{
		int count=0;
		File f1 = new File("xyz");
		System.out.println(f1.exists());	// false
		f1.mkdir();
		System.out.println(f1.exists());	// true
		
		File f2 = new File(f1, "demo.txt");
		f2.createNewFile();
		
		File f3 = new File(f1, "llc.txt");
		f3.createNewFile();
		f3.delete();
		
		String[] fldrs1 = f1.list();
		System.out.println();
		for(String fldr: fldrs1)
		{
			System.out.println(fldr);
		}
		
		System.out.println(f2.length());		// 0
		System.out.println(f3.length());		// 0
		System.out.println(f1.isDirectory());	// true
		System.out.println(f2.isFile());		// false
		
		File f4 = new File("C:\\Users\\Sutar");
		String[] fldrs2 = f4.list();
		System.out.println();
		for(String fldr: fldrs2)
		{
			System.out.println(fldr);
			count++;
		}
		System.out.println("Total number of Files & Directories are:"+count);
	}
}