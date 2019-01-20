//IllegalThreadStateException

class EH37
{
	static public void main(String... Kuntan)
	{
		Thread t = new Thread();
		t.start();
		t.start();
	}
}