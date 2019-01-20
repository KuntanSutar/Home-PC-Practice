// 2 interfaces can contain a variable with same name there may be chance of variable naming comflicts 
// We can solve this comflicts by using interface names as every interface variable is static by default

interface A
{
	int x=777;
}

interface B
{
	int x=888;
}

class Fire16 implements A,B
{
	static public void main(String... Kuntan)
	{
		// System.out.println(x); 	Reference to x is ambiguous; because it is present in both interfaces A,B
		System.out.println(A.x);
		System.out.println(B.x);
	}
}
