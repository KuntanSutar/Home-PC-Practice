class PrintMatrix
{
	public static void printArray(int[][] array)
	{
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
	}
}