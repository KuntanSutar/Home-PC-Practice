// We can access static variables directly from both instance & static areas
class Alert46
{
	static int x=10;
	static public void main(String[] args)
	{
		System.out.println(x);
	}
	
	public void m1()
	{
		System.out.println(x);
	}
}