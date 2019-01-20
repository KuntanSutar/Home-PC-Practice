class MoveMatrixRight
{
	public static void moveMatrixRight(int[][] array)
	{
		int[] temp = new int[3]; 
		for(int i=0; i<3; i++)
		{
			temp[i]=array[i][2];
		}
		for(int j=0; j<3; j++)
		{
			array[j][2]=array[j][1];
		}
		for(int k=0; k<3; k++)
		{
			array[k][1]=array[k][0];
		}
		for(int l=0; l<3; l++)
		{
			array[l][0]=temp[l];
		}
	}
}