/* StringTokenizer:
Default regular expression for the StringTokenizer is space.
*/

import java.util.*;

class Test
{
	public static void main(String[] args)
	{
		StringTokenizer st = new StringTokenizer("Kuntan Shivaji Sutar");
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}
}
