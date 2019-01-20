class Alert28
{
	static int i;
	void print()
	{
		System.out.println(i);
		i=i+1;
	}
	static public void main(String[] args)
	{
		Alert28 alt = new Alert28();
		alt.print();
		alt.print();
	}
}