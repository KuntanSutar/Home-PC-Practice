// Every Case Label should be in the range of switch argument type. Otherwise CE.
class Alert94
{
	public static void main(String[] args)
	{
		byte b=10;		// -128 to 127			
		
		switch(b)				
		{
			case 10			:System.out.println("10");		
							 break;
			case 10+20		:System.out.println("30");		
							 break;
			case 10+20+30	:System.out.println("60");		
							 break;			
			case 1000		:System.out.println("1000");		
							 break;	
		}
	}
}