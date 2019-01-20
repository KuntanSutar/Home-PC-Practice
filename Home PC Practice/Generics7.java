// Compile time activities: 
// 1. Compile code normally by considering Generics Syntax
// 2. Remove Generic Syntax
// 3. Compile once again with resultant code

import java.util.*;

class Test
{
	// Following declarations are equal
	// For these ArrayList objects, we can add only String type of objects
	ArrayList<String> al1=new ArrayList();
	ArrayList<String> al2=new ArrayList<String>();
	
	/*
	Type Safety or Type Casting all these terms are applicable at Compile Time. Not at Runtime.
	At the time of Compilation, as a last step Generic syntax will be removed. Hence, Generic syntax won’t be available to JVM.
	*/
	public void m1(ArrayList<String> al)
	{
	}
	public void m1(ArrayList<Integer> al)
	{
	}
}

/*
O/P:
name clash: m1(ArrayList<Integer>) and m1(ArrayList<String>) have the same erasure
erasure: Method signature without Generic syntax
*/