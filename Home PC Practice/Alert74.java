// instanceof Operator
// For any Class or Interface X; null instanceof X is always "false" 
class Alert74
{
	static public void main(String... kuntan)
	{
		Thread t = new Thread();
		System.out.println(t instanceof Thread);	
		System.out.println(t instanceof Runnable);	
		System.out.println(t instanceof Object);
		//System.out.println(t instanceof String);		There should be some relation between argument types
		System.out.println(null instanceof Thread);	
		System.out.println(null instanceof Runnable);	
	}
}
