// Delete duplicate numbers form the file

import java.io.*;

class Test
{
	public static void main(String[] args) throws IOException
	{
		PrintWriter pw = new PrintWriter("DuplicateDeletedFile.txt"); 
		BufferedReader br1 = new BufferedReader(new FileReader("DeleteDuplicate.txt"));
		String line1 = br1.readLine();

		while(line1 != null)
		{
			boolean available = false;

			BufferedReader br2 = new BufferedReader(new FileReader("DuplicateDeletedFile.txt"));
			String line2 = br2.readLine();
			while(line2 != null)
			{
				if(line1.equals(line2))
				{
					available=true;
					break;
				}
				line2=br2.readLine();
			}
			if(available==false)
			{
				pw.println(line1);
				pw.flush();
			}
			line1=br1.readLine();
		}
	}
}
