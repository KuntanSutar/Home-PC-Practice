// Fall through inside switch
class Alert97
{
	public static void main(String[] args)
	{
		int x=2;		
		
		switch(x)		
		{
			default			:System.out.println("You should die!"); 
			case 1			:
			case 2   		:
			case 3			:System.out.println("Till 3");		
							 break;
			case 4  		:
			case 5      	:	
			case 6      	:System.out.println("Till 6");			
							 break;			
			case 1000		:System.out.println("1000");	
							 break;						
		}
	}
}