// Difference between == operator & .equals() method
class Alert73
{
	public static void main(String[] args)
	{
		String s1 = new String("Kuntan");
		String s2 = new String("Prasad");
		String s3 = new String("Prasad");
		StringBuffer s4 = new StringBuffer("Kiran");
		Object obj1 = new Object();
		Object obj2 = new Object();
		System.out.println(s1==s2);
		System.out.println(s2==s3);
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		System.out.println(s1==null);
		System.out.println(null==null);
		System.out.println(obj1==obj2);
		System.out.println(obj1.equals(obj2));
		System.out.println(s1.equals(s4));				//For reference comparison
	}
}