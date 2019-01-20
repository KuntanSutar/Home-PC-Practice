//Write a program to display only directory names.

import java.io.*;

class Test
{
	static public void main(String... Kuntan)
	{
		int count=0;
		File f1 = new File("C:\\Users\\Sutar");
		String[] fldrs1 = f1.list();
		for(String fldr:fldrs1)
		{
			File f = new File(f1,fldr);
			if(f.isDirectory())
			{
				count++;
				System.out.println("Directory : "+fldr);
			}
		}
		System.out.println("Total number of Directories are:"+count);
	}
}