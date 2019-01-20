// DateFormat object for the default Locale

import java.text.*;	// For DateFormat class
import java.util.*;	// For Date class

class Test
{
	public static void main(String args[])
	{ 
		System.out.println("Full form is :"+DateFormat.getDateInstance(0).format(new Date())); 
		System.out.println("Long form is :"+DateFormat.getDateInstance(1).format(new Date())); 
		System.out.println("Medium form is :"+DateFormat.getDateInstance(2).format(new Date())); 
		System.out.println("Short form is :"+DateFormat.getDateInstance(3).format(new Date())); 
	}
}
