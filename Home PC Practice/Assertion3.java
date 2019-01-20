// Assertion Alert

class Test
{
	static public void main(String... Kuntan)
	{
		int x = 10;
		assert(x > 10): ++x;	// Whatever we write after colon (:) symbol, that will be printed as a AssertionError discription
		System.out.println(x);
	}
}

/*
Output: Exception in thread "main" java.lang.AssertionError: 11
        at Test.main(Assertion3.java:7)
*/
