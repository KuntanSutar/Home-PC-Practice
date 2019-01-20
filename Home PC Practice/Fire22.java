class Fire22
{
	static public void main(String... Kuntan)
	{
		Integer I = new Integer(10);
		Number N = (Number)I;
		Object O = (Object)N;
		System.out.println(I==N);
		System.out.println(N==O);
	}										
}