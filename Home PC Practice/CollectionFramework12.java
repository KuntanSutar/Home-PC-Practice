import java.util.*;

class TreeSetDemo
{
	static public void main(String... Kuntan)
	{
		TreeSet ts = new TreeSet();
		ts.add(null);		// For empty TreeSet as first element null is allowed till 1.6 Version & in all other cases we will get NullPointerException.
		System.out.println(ts);					
	}
}