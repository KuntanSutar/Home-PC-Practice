class Alert81
{
	static public void main(String... Kuntan) throws Exception
	{
		Thread t = new Thread();
		System.out.println(Class.forName(Kuntan[0]).isInstance(t));
	}
}