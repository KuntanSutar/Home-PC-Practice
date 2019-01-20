import java.io.*;
class EH20
{
	static public void main(String... Kuntan)
	{
		PrintWriter pw = new PrintWriter("abc.txt");	//Prints formatted representations of objects to a text-output stream.
		pw.println("Hello");							//unreported exception FileNotFoundException; must be caught or decalred to be thrown
	}
}
