class M 
{ 
	M() 
	{ 
		System.out.println("M Constructor Called"); 
	} 
	{ 
		System.out.println("M IIB block"); 
	} 
} 

class N extends M
{ 
	N() 
	{  
		System.out.println("N Constructor Called"); 
	} 
	{ 
		System.out.println("N IIB block"); 
	} 
	
	public static void main(String[] args) 
	{ 
		N n = new N(); 
	} 
} 
