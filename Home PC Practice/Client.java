class Client
{
	static public void main(String... Kuntan)
	{
		int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
		
		MoveMatrixUp.moveMatrixUp(matrix1);
		PrintMatrix.printArray(matrix1);
		System.out.println("\n");
		
		int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
		
		MoveMatrixDown.moveMatrixDown(matrix2);
		PrintMatrix.printArray(matrix2);
		System.out.println("\n");
		
		int[][] matrix3 = {{1,2,3},{4,5,6},{7,8,9}};
		
		MoveMatrixRight.moveMatrixRight(matrix3);
		PrintMatrix.printArray(matrix3);
		System.out.println("\n");
		
		int[][] matrix4 = {{1,2,3},{4,5,6},{7,8,9}};
		
		MoveMatrixLeft.moveMatrixLeft(matrix4);
		PrintMatrix.printArray(matrix4);
		System.out.println("\n");
	}
}