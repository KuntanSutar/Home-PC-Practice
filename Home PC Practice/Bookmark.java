import java.io.*;
import java.awt.Desktop;

class Test
{
	public static void main(String[] args) throws Exception
	{
		File htmlFile = new File("D:\\KUNTAN\\SwabhavRepository\\OOP Workspace\\bookmarks-app\\MyBookmarks.htm");
		Desktop.getDesktop().browse(htmlFile.toURI());
	}
}