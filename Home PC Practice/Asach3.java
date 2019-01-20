import java.io.*;
class Asach3
{
	public void m1() 
	{
		System.out.println(1);
	}
	
	int m1(int i) throws IOException, InterruptedException	// While overloading return type, access modifiers & exception thrown need not to be same
	{
		return i;
	}
	
	static public void main(String... Kuntan) throws IOException, InterruptedException
	{
		int result;
		Asach3 asach = new Asach3();
		asach.m1();
		result=asach.m1(5);
		System.out.println(result);
	}
}
