// Both switch arguments & case lable can be expression. 
// But, case label should be constant
class Alert93
{
	public static void main(String[] args)
	{
		int x=10;				
		int y=20;
		
		switch(x+y)				
		{
			case 10			:System.out.println("10");		
							 break;
			case 10+20		:System.out.println("30");		
							 break;
			case 10+20+30	:System.out.println("60");		
							 break;				 
		}
	}
}