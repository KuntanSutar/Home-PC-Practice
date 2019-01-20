// For-each loop
class Bomb32
{
	static public void main(String... Kuntan)
	{
		int[] x = {1,2,3,4,5}; 
		
		for(int i=0; i<x.length; i++)
		{
			System.out.println(x[i]);
		}
		System.out.println("\n");
		
		for(int x1: x)
		{
			System.out.println(x1);
		}
		System.out.println("\n");
		
		
		int[][] y = {{1,2,3,4},{5,6,7,8}};
		for(int i=0; i<y.length; i++)
		{
			for(int j=0; j<y[i].length; j++)
			{
				System.out.println(y[i][j]);
			}
		}
		System.out.println("\n");
		
		for(int[] y1: y)
		{
			for(int y2: y1)
			{
				System.out.println(y2);
			}
		}
		System.out.println("\n");
		
		
		int[][][] z = {{{1,2,3},{4,5,6}},{{7,8,9},{10,11,12}}};
		for(int i=0; i<z.length; i++)
		{
			for(int j=0; j<z[i].length; j++)
			{
				for(int k=0; k<z[i][j].length; k++)
				{
					System.out.println(z[i][j][k]);
				}
			}
		}
		System.out.println("\n");
		
		for(int[][] z1:z)
		{
			for(int[] z2:z1)
			{
				for(int z3:z2)
				{
					System.out.println(z3);
				}
			}
		}
		System.out.println("\n");
	}
}