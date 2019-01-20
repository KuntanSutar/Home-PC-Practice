import java.text.*;
import java.util.*;

class Test
{
	public static void main(String args[])
	{
		DateFormat ITALY = DateFormat.getDateTimeInstance(0,0,Locale.ITALY);
		System.out.println("ITALY style is:"+ITALY.format(new Date()));
		
		DateFormat US = DateFormat.getDateTimeInstance(0,0,Locale.US);
		System.out.println("ITALY style is:"+US.format(new Date()));
		
		DateFormat UK = DateFormat.getDateTimeInstance(0,0,Locale.UK);
		System.out.println("ITALY style is:"+UK.format(new Date()));
	}
}
