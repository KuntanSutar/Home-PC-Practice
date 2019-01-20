import java.text.*;

class Test
{
	public static void main(String[] args)
	{ 
		NumberFormat nf = NumberFormat.getInstance();
		nf.setMaximumFractionDigits(2);	// Either 2 digits or less that 2 digits. Not compulsory 2 digits always

		System.out.println(nf.format(123.4567));	// 123.46
		System.out.println(nf.format(123.4));		// 123.4
		
		nf.setMinimumFractionDigits(2);
		System.out.println(nf.format(123.4567));	// 123.4567
		System.out.println(nf.format(123.4));		// 123.40
		
		nf.setMaximumIntegerDigits(3);
		System.out.println(nf.format(123456.789));	// 456.789
		System.out.println(nf.format(1.2345));		// 1.2345
		
		nf.setMinimumIntegerDigits(3);	// Either 3 digits or more that 3 digits.
		System.out.println(nf.format(123456.789));	// 123,456.789
		System.out.println(nf.format(1.2345));		// 001.2345
	}
}
