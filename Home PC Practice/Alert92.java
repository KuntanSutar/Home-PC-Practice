// Every Case label should be constant (compile time constant) expression
class Alert92
{
	public static void main(String[] args)
	{
		int x=1;
		//final int y=2;						// If we declare variable y as final; then we won't get any CE.
		int y=2;
		switch(x)				
		{
			case 1:System.out.println("1");		
				   break;
			case y:System.out.println("2");		// Constant Expression Required
				   break;
		}
	}
}