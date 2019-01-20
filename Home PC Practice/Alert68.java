// For integer arithmetic : No way to represent Infinity, Undefined Results
// For floating point arithmetic : There is a way to represent Infinity, Undefined Results
class Alert68
{
	public static void main(String[] args)
	{
		// System.out.println(10/0);		Infinity
		System.out.println(10/0.0);
		System.out.println(-10.0/0);
		
		// System.out.println(0/0);			Undefined Results
		System.out.println(0.0/0);
		System.out.println(-0.0/0);
	}
}