// Your wrong mind!!
// It doesn't happen like this!!!
class Alert64
{
	public static void main(String[] args)
	{
		int x=10;
		final int a=10; 
		int y=++10;
		int z=++(++x);
		System.out.println(y);
		System.out.println(z);
		a++;
		System.out.println(a);
	}
}