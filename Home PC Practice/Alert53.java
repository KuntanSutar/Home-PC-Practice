// Local Level Array
// For local variables JVM; won't provide default values
class Alert53
{
	public static void main(String[] args)
	{
		int[] x;						// 
		System.out.println(x);			// C.E: variable x might not have been initialized
		System.out.println(x[0]);
		
		int[] y = new int[3];
		System.out.println(y);
		System.out.println(y[0]);
	}
}