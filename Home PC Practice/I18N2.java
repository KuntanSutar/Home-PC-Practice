// Funny : In Italy comma becomes dot & dot becomes comma

import java.util.*;	// For Locale class
import java.text.*;	// For NumberFormat class

class Test
{
	public static void main(String args[])
	{
		double d=123456.789;
		NumberFormat nf = NumberFormat.getInstance(Locale.ITALY); 
		System.out.println("ITALY specific form is: "+nf.format(d)); 
	}
}

// Output: ITALY specific form is: 123.456,789