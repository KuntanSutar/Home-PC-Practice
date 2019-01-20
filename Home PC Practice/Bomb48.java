// Precedence while resolving static members:
// 1. Current class static members
// 2. Explicit static members 
// 3. Implicit static members

// import static java.lang.Integer.MAX_VALUE; 	If we comment this line also then implicit static members i.e Byte class's MAX_VALUE will be considered	
import static java.lang.Byte.*;

class Bomb48
{
	// static int MAX_VALUE =999;	If we comment this line then explicit static members i.e Integer class's MAX_VALUE will be considered	
	static public void main(String... Kuntan)
	{
		System.out.println(MAX_VALUE);		
	}
}