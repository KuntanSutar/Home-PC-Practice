class StringBehaviour
{
	public static void main(String[] args)
	{
		//byte[] b = {100,101,102,103};
		String str1 = new String("         ababababab            ");
		String str2 = str1.toUpperCase();
		String str3 = str1.toLowerCase();
		System.out.println(str1 == str2);
		System.out.println(str1 == str3);
		//int index = str.lastIndexOf('a');
		//System.out.println(index);
		//System.out.println(str.equalsIgnoreCase("java"));
		//System.out.println(str);	
	}
}

// Because of runtime operation if there is change in content; then with those changes a new object wll be created on the heap.
// if there is no change in content; then existing object will be reused & new object won't be created.