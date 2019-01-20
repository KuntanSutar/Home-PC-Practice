import java.util.regex.*;

class Test
{
	public static void main(String[] args)
	{
		int count=0;
		Pattern p = Pattern.compile("a?");	// ? means any number of times
		Matcher m = p.matcher("b5babbb7aa8bcc@aaa#$%a");
		while(m.find())
		{
			count++;
			System.out.println(m.start()+"------"+m.end()+"------"+m.group());	
		}	
		System.out.println("The number of occurences:"+count);	
	}	
}		
