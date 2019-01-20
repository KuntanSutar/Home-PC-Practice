// All resource reference variables are implicitely final
// Hence, within try block we can't perform reassignment 

import java.io.*;
class TryWithResources
{
	static public void main(String... Kuntan) throws Exception
	{
		try(BuffferedReader br = new BuffferedReader(new FileReader("input.txt")))
		{
			br = new BuffferedReader(new FileReader("output.txt"));
		}
	}
}