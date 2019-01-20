// Instance Level Array
class Alert51
{
	int[] x;								// Uninitialized Array						
	int[] y = new int[3];					// Initialized Array	
	public static void main(String[] args)
	{
		Alert51 alt = new Alert51();
		System.out.println(alt.x);
		//System.out.println(alt.x[0]);
		
		System.out.println(alt.y);
		System.out.println(alt.y[0]);
	}
}