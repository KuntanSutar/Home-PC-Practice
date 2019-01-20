class MoveMatrixUp
{
	public static void moveMatrixUp(int[][] array)
	{
		int[] temp = new int[3]; 
		for(int i=0; i<3; i++)
		{
			temp[i]=array[0][i];
		}
		for(int j=0; j<3; j++)
		{
			array[0][j]=array[1][j];
		}
		for(int k=0; k<3; k++)
		{
			array[1][k]=array[2][k];
		}
		for(int l=0; l<3; l++)
		{
			array[2][l]=temp[l];
		}
	}
}