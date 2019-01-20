class MoveMatrixLeft
{
	public static void moveMatrixLeft(int[][] array)
	{
		int[] temp = new int[3]; 
		for(int i=0; i<3; i++)
		{
			temp[i]=array[i][0];
		}
		for(int j=0; j<3; j++)
		{
			array[j][0]=array[j][1];
		}
		for(int k=0; k<3; k++)
		{
			array[k][1]=array[k][2];
		}
		for(int l=0; l<3; l++)
		{
			array[l][2]=temp[l];
		}
	}
}