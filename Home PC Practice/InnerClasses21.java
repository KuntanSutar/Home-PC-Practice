interface Vehicle 
{
	public int getNoOfWheels();
	
	class DefaultVehicle implements Vehicle 	
	{
		public int getNoOfWheels() 	// Default Implementation
		{
			return 2;
		}
	}
}

class Bus implements Vehicle 
{
	public int getNoOfWheels() 		// Customized Implementation
	{
		return 4;
	}
}

class Test 
{
	public static void main(String args[]) 
	{
		Vehicle.DefaultVehicle d = new Vehicle.DefaultVehicle();
		System.out.println(d.getNoOfWheels());	// 2
		
		Bus b=new Bus();
		System.out.println(b.getNoOfWheels());	// 4
	}
}