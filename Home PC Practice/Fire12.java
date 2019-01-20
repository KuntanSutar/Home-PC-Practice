// Every interface variable is always "public static final" whether we are declaring or not!
// Inside interface implementation class we can access interface variables; but we can't modify values

interface A
{
	int x=10;
}
/*class Fire12 implements A
{
	static public void main(String... Kuntan)
	{
		x=777;			// Reassignment can't be possible
		System.out.println(x);
	}
}
*/
class Trick implements A
{
	static public void main(String... Kuntan)
	{
		int x=777;
		System.out.println(x);
	}
}