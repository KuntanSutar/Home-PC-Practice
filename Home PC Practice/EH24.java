// In this code snippet; if we removed atleast one throws statement; then we will get CE

class EH24
{
	static public void main(String... Kuntan) throws InterruptedException
	{
		doStuff();
	}
	static public void doStuff() throws InterruptedException
	{
		doMoreStuff();
	}
	static public void doMoreStuff() throws InterruptedException
	{
		Thread.sleep(10000);
	}
}