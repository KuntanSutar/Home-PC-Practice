/* toHexString() function is called with hashCode as parameter

public String toString() 
{
	return getClass().getName() + "@" + Integer.toHexString(hashCode());
}

*/

class EyeOpener3
{
	int i;
	EyeOpener3(int i)
	{
		this.i=i;
	}
	
	public int hashCode()
	{
		return i;
	}
	static public void main(String... Kuntan)
	{
		EyeOpener3 eo1 = new EyeOpener3(10);
		EyeOpener3 eo2 = new EyeOpener3(100);
		System.out.println(eo1);	 
		System.out.println(eo2);	
	}
}

O/P:

EyeOpener3@a	// a is hexadecimal conversion of 10
EyeOpener3@64	// a is hexadecimal conversion of 100