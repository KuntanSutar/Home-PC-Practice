import java.util.*;
import java.text.*;

class Test
{
	public static void main(String args[])
	{ 
		double d=123456.789;
		Locale INDIA = new Locale("Marathi","IN");
		
		NumberFormat nf1 = NumberFormat.getCurrencyInstance(INDIA); 
		System.out.println("INDIA notation is :"+nf1.format(d));

		NumberFormat nf2 = NumberFormat.getCurrencyInstance(Locale.UK);
		System.out.println("UK notation is :"+nf2.format(d));
		
		NumberFormat nf3 = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US notation is :"+nf3.format(d));

		NumberFormat nf4 = NumberFormat.getCurrencyInstance(Locale.ITALY);
		System.out.println("ITALY notation is :"+nf3.format(d));
	}
}
/*
Output:
INDIA notation is :INR 123,456.79	// This format is configured for India Locale
UK notation is :£123,456.79
US notation is :$123,456.79
ITALY notation is :$123,456.79
*/