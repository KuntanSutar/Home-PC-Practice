// Var-Arg method with group of arrays as a parameter
class Alert58
{
	public static void m1(int[]... x)
	{
		for(int[] x1:x)
		{
			System.out.println(x1[0]);
		}
	}

	public static void main(String[] args)
	{
		int[] a = {1,2,3,4};
		int[] b = {5,6,7,8};
		m1(a,b);
	}
}