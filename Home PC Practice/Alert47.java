class Alert47
{
	static int x=10;
	int y=20;
	static public void main(String[] args)
	{
		Alert47 alt1 = new Alert47();
		alt1.x=888;
		alt1.y=999;
		Alert47 alt2 = new Alert47();
		System.out.println(alt2.x+"..."+alt2.y);
	}
	
	public void m1()
	{
		System.out.println(x);
	}
}