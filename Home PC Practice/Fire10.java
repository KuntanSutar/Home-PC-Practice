// Every method present inside Interfaces is always "public & abstract" by default; whether we are declaring or not 
// public can't be put along with private, protected
// abstract can't be put along with static, strictfp, synchronized, final, native

interface Fire10
{
	// All these methods are equivalent
	// void m1();
	// public void m1();
	// abstract void m1();
	// public abstract void m1();
	
	public void m1()		// interface's abstract method can't have body
	{
	}
	private void m2();		// private modifier not allowed
	protected void m3();	// protected modifier not allowed
	static void m4();
	native void m5();
	
}