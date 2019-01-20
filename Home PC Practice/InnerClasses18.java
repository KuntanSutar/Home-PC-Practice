class VehicleType 
{
	interface Vehicle 
	{
		public int getNoOfWheels();
	}
	class Bus implements Vehicle 
	{
		public int getNoOfWheels() 
		{
			return 6;
		}
	}
	class Auto implements Vehicle 
	{
		public int getNoOfWheels()
		{
			return 3;
		}
	}
}