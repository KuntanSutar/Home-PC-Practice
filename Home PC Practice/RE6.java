import java.util.*;

class Test
{
	public static void main(String[] args)
	{
		StringTokenizer st = new StringTokenizer("6-11-2018","-");	// Here we are explicitly specifying regular expression as '-'
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}