/*Inside Anonymous inner classes we can take or declare new methods; but outside of anonymous inner classes we can't call these methods directly because we are
depending on parent reference.[parent reference can be used to hold child class object
but by using that reference we can't call child specific methods]. These methods just for
internal purpose only.
*/

class Popcorn
{
	public void taste()
	{
		System.out.println("Salty");
	}
}

class Test
{
	static public void main(String... Kuntan)
	{
		Popcorn p1 = new Popcorn();
		p1.taste();		// Salty
		
		// Here, internally object of Anonymous Inner Class (Test$1) is created.
		Popcorn p2 = new Popcorn()
		{
			public void taste()
			{
				System.out.println("Spicy");
			}
			// This method is meant for internal use only.
			public void tricky()
			{
				System.out.println("Tricky");
			}
		};
		p2.taste();		// Spicy
		//p2.tricky();	This is not possible. Method should be overridden. Check it!!!
		
		// Here, internally object of Anonymous Inner Class (Test$2) is created.
		Popcorn p3 = new Popcorn()
		{
			public void taste()
			{
				System.out.println("Sweet");
			}
		};
		p3.taste();		// Sweet
		
		System.out.println(p1.getClass().getName());	// Popcorn
		System.out.println(p2.getClass().getName());	// Test$1
		System.out.println(p3.getClass().getName());	// Test$2
	}
}


