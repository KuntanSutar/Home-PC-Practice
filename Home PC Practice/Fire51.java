// Compiler will generate Child class constructor by default as:
// C()
// {
//  	super();
// }	
// But, Parent class P doesn't contain no-arg constructor, hence CE.

class P
{
	P(int i)
	{
	}
}
class C extends P
{
}