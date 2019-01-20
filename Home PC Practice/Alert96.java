class Alert96
{
	public static void main(String[] args)
	{
		int x=10;		
		
		switch(x)		
		{
			case 97			:System.out.println("97");		
							 break;
			case 'a'		:System.out.println("a");		
							 break;
			case 10			:System.out.println("10");		
							 break;
			case 10+20		:System.out.println("30");		
							 break;
			case 10+20+30	:System.out.println("10+20+30");		
							 break;		
			case 10+20+30	:System.out.println("60");			// Duplicate Case Label are not allowed in switch
							 break;			
			case 1000		:System.out.println("1000");	
							 break;	
		}
	}
}