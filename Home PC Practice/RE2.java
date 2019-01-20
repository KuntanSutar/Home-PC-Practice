import java.util.regex.*;

class Test
{
	public static void main(String[] args)
	{
		Pattern p = Pattern.compile("a");
		String[] strings = p.split("www.kuntansutar.com");
		for(String string:strings)
		{
			System.out.println(string);
		}
	}
}