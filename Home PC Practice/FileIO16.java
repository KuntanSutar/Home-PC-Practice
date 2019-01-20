// Write a program to merge data from all the files present in a folder into a new File

import java.io.*;

class Test
{
	public static void main(String[ ] args) throws IOException
	{
		File f = new File("C:\\Users\\Sutar\\MergeDataFromAllTheFilesPresentInAFolder");
	
		PrintWriter pw = new PrintWriter("CombinedFile.txt");
		
		String[] files = f.list();
		System.out.println(files.length);
		
		for(String file:files)
		{
			File f1 = new File(f, file);
			BufferedReader br = new BufferedReader(new FileReader(f1));
			String line = br.readLine();
			
			while(line!=null)
			{
				pw.println(line);
				line=br.readLine();
				pw.flush();
			}	
		}
	}
}