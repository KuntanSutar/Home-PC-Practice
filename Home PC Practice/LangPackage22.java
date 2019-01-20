class WrapperClassDemo  
{
	public static void main(String[] args) 
	{
		Boolean b1=new Boolean(true);
		System.out.println(b1);
		Boolean b2=new Boolean(false);
		System.out.println(b2);
		// Boolean b3=new Boolean(True); C.E
		// Boolean b4=new Boolean(False); C.E
		// Boolean b5=new Boolean(TRUE); C.E
		Boolean b6=new Boolean("true");
		System.out.println(b6);
		Boolean b7=new Boolean("false");
		System.out.println(b7);
		Boolean b8=new Boolean("True");
		System.out.println(b8);
		Boolean b9=new Boolean("False");
		System.out.println(b9);
		Boolean b10=new Boolean("TRUE");
		System.out.println(b10);
		Boolean b11=new Boolean("FALSE");
		System.out.println(b11);
		Boolean b12=new Boolean("TRue");
		System.out.println(b12);
		Boolean b13=new Boolean("FAlse");
		System.out.println(b13);
		Boolean b14=new Boolean("Kuntan");
		System.out.println(b14);
		Boolean b15=new Boolean("yes");
		Boolean b16=new Boolean("no");
		System.out.println(b15);//false
		System.out.println(b16);//false
		System.out.println(b15.equals(b16));//true
		System.out.println(b15==b16);//false
	}
}
