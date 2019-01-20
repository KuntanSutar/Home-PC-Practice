// Justdial Interview Questions
import java.util.*;

class Test
{
	public String largestNumber(int[] nums) 
	{
		String[] arr = new String[nums.length];
		
		for(int i=0; i<nums.length; i++)
		{
			arr[i]=String.valueOf(nums[i]);
		}
 
		Arrays.sort(arr, new Comparator<String>()
		{
			public int compare(String a, String b)
			{
				return (b+a).compareTo(a+b);
			}
		});
 
		StringBuilder sb = new StringBuilder();
		for(String s: arr)
		{
			sb.append(s);
		}
 
		while(sb.charAt(0)=='0' && sb.length()>1)
		{
			sb.deleteCharAt(0);
		}
      
		return sb.toString();
	}
	
	static public void main(String... Kuntan)
	{
		int[] nums1 = {54, 546, 548, 60};
		int[] nums2 = {49, 15, 80, 481};
		int[] nums3 = {113, 201, 36, 9};
		
		Test t = new Test();
		String answer1 = t.largestNumber(nums1);
		System.out.println(answer1);
		
		String answer2 = t.largestNumber(nums2);
		System.out.println(answer2);
		
		String answer3 = t.largestNumber(nums3);
		System.out.println(answer3);
	}
}
