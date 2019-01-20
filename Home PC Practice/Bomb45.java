// By using static import we can access static members directly without Class Name i.e Math (java.lang.Math) 
import static java.lang.Math.sqrt;		// It is understood that lang is by default imported
import static java.lang.Math.*;			// But, static import statements are written for accessing static members directly without Class Name

class Bomb45
{
	static public void main(String... Kuntan)
	{ 
		System.out.println(sqrt(4));		// 2.0 -> Takes double as argument
		System.out.println(max(10,20));		
		System.out.println(random());
	}
}