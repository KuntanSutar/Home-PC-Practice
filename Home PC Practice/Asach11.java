// If Child class's method throws 1 or more Checked Exception; then Parent class's method should throw same Checked Exception or it's Parent type.

import java.io.*;
class P
{
	public String m1() throws Exception
	{
		return null;
	}
}

class C extends P
{
	public String m1() throws IOException, InterruptedException
	{
		return null;
	}
}

class Asach11
{
	static public void main(String... Kuntan) throws Exception
	{
		P p = new C();
		p.m1();
	}
}