class Asach22
{
	private double balance = 10000;
	public double getBalance()
	{
		return balance;
	}
}

class Test extends Asach22
{
	static public void main(String... Kuntan)
	{
		Asach22 asch = new Asach22();
		System.out.println(asch.getBalance());
		//System.out.println(balance); CE: balance has private access in Asach22
	}
}