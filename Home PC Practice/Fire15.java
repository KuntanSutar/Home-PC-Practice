// Can Java class implement any number of interfaces simultaneously?
// Yes, expect a particular case:
// If 2 interfaces contains a method with sam signature but different return type; then it is impossible to implement both interfaces simultaneously
// If return types are not co-variant

interface Left
{
	public void m1();
}

interface Right
{
	public int m1();
}
class Fire15 implements Left, Right
{

}