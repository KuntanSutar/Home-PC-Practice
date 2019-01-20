// There is no dangling else problem in Java
class Alert88
{
	public static void main(String[] args)
	{
		if(false) 						// Else part is not written for this if				
		  if(false)
		  System.out.println("Hello");
		  else							// This else part is of second if. 
		  System.out.println("Hi");		
	}
}