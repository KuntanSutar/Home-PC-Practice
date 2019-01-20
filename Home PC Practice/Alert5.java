// Both classes String & StringBuffer are at same level in Java Class Hierarchy
// Hence; while resolving overloaded methods compiler will get confuse while deciding which method to give preference 

class Alert5
{
	public void m1(String s)
	{
		System.out.println("String Version");
	}
	
	public void m1(StringBuffer sb)
	{
		System.out.println("StringBuffer Version");
	}
	
	public static void main(String[] args)
	{
		Alert5 alt = new Alert5();
		alt.m1("kuntan");
		alt.m1(new StringBuffer("kuntan"));
		alt.m1(null);
	}
}

	