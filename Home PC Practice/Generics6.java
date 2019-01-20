//Type Safety or Type Casting all these terms are applicable at Compile Time. Not at Runtime.
//At the time of Compilation, as a last step Generic syntax will be removed. Hence, Generic syntax won’t be available to JVM.
//For Non-Generic reference variable we can assign Generic Object.
//Hence, we won't get any RE.

import java.util.*;

class Test
{
	public static void main(String[] args)
	{
		ArrayList al=new ArrayList<String>();
		al.add("A");
		al.add(10);	
		al.add(10.5);	
		System.out.println(al);	//[A, 10, 10.5]
	}
}