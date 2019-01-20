class Test
{
	int number;
	
	public static void main(String[] args)
	{
		int no = m1(9);
		System.out.println(no);
		System.out.println(new Test().number);
		calcArea(10, 20);
	}
	
	public static int m1(int number)
	{
		number=number;
		return number;
	}
	
	public static int calcArea(int heigth, int width)
	{
		return heigth*width;
	}
}