class Asach43
{
	static public void main(String... Kuntan)
	{
		String input = "This is Inspeero Technologies";
		String[] inputArray = input.split(" ");
		for(String str : inputArray)
		{
			int length = str.length();
			char[] xyz = new char[length];
			xyz = str.toCharArray();
			String abc = xyz.toString();
			System.out.println(abc);
		}
	}
}