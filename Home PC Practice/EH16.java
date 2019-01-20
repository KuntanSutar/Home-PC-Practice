class EH16
{
	static public void main(String... Kuntan)
	{
		System.out.println(10/0);	// Here compiler never checks/knows that at this line exception will be rised or not!! Hence, it gives chance
		System.out.println("Hello");
	}
}