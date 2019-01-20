class AutoboxingAutounboxingDemo
{
	public static void main(String[] args)
	{ 
		Integer X=new Integer(10);
		Integer Y=new Integer(10);
		System.out.println(X==Y);	// false
		
		Integer A=new Integer(10);
		Integer B=10;
		System.out.println(A==B);	// false
		
		Integer C=10;
		Integer D=10;
		System.out.println(C==D);	// true
		
		Integer E=100;
		Integer F=100;
		System.out.println(E==F);	// true
		
		Integer G=128;
		Integer H=128;
		System.out.println(G==H);	// false
		
		Integer I=1000;
		Integer J=1000;
		System.out.println(I==J);	// false
		
		Boolean K=true;
		Boolean L=true;
		System.out.println(K==L);	// true
		
		Double M=0.0;
		Double N=0.0;
		System.out.println(M==N);	// false
	}
}