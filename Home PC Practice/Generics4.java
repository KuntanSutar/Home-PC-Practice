import java.util.*;

class Test
{
	static public void main(String... Kuntan)
	{
		ArrayList<String> al1 = new ArrayList<String>();
		ArrayList<?> al2 = new ArrayList<String>();
		ArrayList<?> al3 = new ArrayList<Integer>();
		ArrayList<? extends Number> al4 = new ArrayList<Integer>();
		//ArrayList<? extends Number> al5 = new ArrayList<String>();
		ArrayList<? super String> al6 = new ArrayList<Object>();
		//ArrayList<?> al7 = new ArrayList<?>();
		//ArrayList<?> al8 = new ArrayList<? extends Number>();		
	}
}