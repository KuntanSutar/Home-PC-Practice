class P
{
	static int x;
	int y;
	int z;
	P()
	{
		this.x=10;
		this.y=20;
		this.z=30;
	}
	static public void main(String... Kuntan)
	{
		P p = new P();
		System.out.println(p.x+"..."+p.y+"..."+p.z);
	}
}