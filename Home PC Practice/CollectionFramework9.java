import java.util.*;

class CompareToDemo
{
	static public void main(String... Kuntan)
	{
		System.out.println("A".compareTo("Z"));		// -25
		System.out.println("Z".compareTo("B"));		// 24
		System.out.println("A".compareTo("A"));		// 0
		System.out.println("A".compareTo(null));	// NPE	
	}
}