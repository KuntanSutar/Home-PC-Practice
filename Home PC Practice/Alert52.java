// Static Level Array
class Alert52
{
	static int[] x;								// Uninitialized Array						
	static int[] y = new int[3];				// Initialized Array	
	public static void main(String[] args)
	{
		Alert52 alt = new Alert52();
		System.out.println(x);
		//System.out.println(x[0]);
		
		System.out.println(y);
		System.out.println(y[0]);
	}
}