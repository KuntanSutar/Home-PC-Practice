// Internal type casting
// byte+byte=int
class Alert78
{
	static public void main(String... kuntan)
	{
		byte b=10;
		//b=b+1; 					byte+int=int
		b++;
		System.out.println(b);
		b+=1;
		System.out.println(b);
	}
}