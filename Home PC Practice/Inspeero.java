class Test 
{
	static Test t = new Test();
	
	static public void main(String... Kuntan)
	{
		String input = "This is Inspeero Technologies";
		String result = "";
		
		String[] inputArray = input.split(" ");
		for(String str : inputArray)
		{
			System.out.println(str);
		}
		
		int totalWords = inputArray.length;
		
		for(int i=0; i<totalWords; i++)
		{
			String word = inputArray[i];
			int stringWordLength = word.length();
			
			System.out.println(stringWordLength);
			
			char[] xyz = new char[stringWordLength];
			xyz = word.toCharArray();
			
			//int charArrayWordLength = xyz.length;
			int vowelCount = t.countVowels(xyz);
			
			if(i%2==0 & vowelCount%2==0)
			{
				result = result + t.putVowelBackward(xyz, stringWordLength)+" ";
			}
			if(i%2==0 & vowelCount%2!=0)
			{
				result = result + t.putVowelForward(xyz, stringWordLength)+" ";
			}
			if(i%2!=0 & vowelCount%2==0)
			{
				result = result + t.putVowelForward(xyz, stringWordLength)+" ";
			}
			if(i%2!=0 & vowelCount%2!=0)
			{
				result = result + t.putVowelBackward(xyz, stringWordLength)+" ";
			}
		}
		System.out.println(result);
	}
	
	public int countVowels(char[] xyz)
	{
		int length = xyz.length;
		int count=0;
		for(int i=0; i<length; i++)
		{
			if(xyz[i]=='a' | xyz[i]=='e' | xyz[i]=='i' | xyz[i]=='o' | xyz[i]=='u' | 
			   xyz[i]=='A' | xyz[i]=='E' | xyz[i]=='I' | xyz[i]=='O' | xyz[i]=='U')
			   {
				   count++;
			   }
		}
		return count;
	}
	
	public String putVowelForward(char[] xyz, int stringWordLength)
	{
		int charArrayWordLength = stringWordLength;
		int tempArraylength = t.countVowels(xyz);
		char temp[] = new char[tempArraylength]; 
		int j=0;
		
		for(int i=0; i<charArrayWordLength; i++)
		{
			if(xyz[i]=='a' | xyz[i]=='e' | xyz[i]=='i' | xyz[i]=='o' | xyz[i]=='u' | 
			   xyz[i]=='A' | xyz[i]=='E' | xyz[i]=='I' | xyz[i]=='O' | xyz[i]=='U')
			   {
				   temp[j] = xyz[i];
				   for(int k=i; k<charArrayWordLength-1; k++)
				   {
					   xyz[k]=xyz[k+1];
				   }
				   charArrayWordLength=charArrayWordLength-1;
				   j++;
			   }
		}
		String vowelsRemovedInputString = new String(xyz);
		System.out.println(vowelsRemovedInputString);
		
		for(int l=0; l<tempArraylength-1; l++)
		{
			for(int m=l+1; m<tempArraylength; m++)
			{
				if(temp[l]==temp[m])
				{
					for(int n=m; n<tempArraylength-1; n++)
					{
						temp[n]=temp[n+1];
					}
					tempArraylength=tempArraylength-1;
				}
			}
		}
		String onlyVowelsString = new String(temp);
		System.out.println(onlyVowelsString);
		
		return (vowelsRemovedInputString+onlyVowelsString);
	}
	
	public String putVowelBackward(char[] xyz, int stringWordLength)
	{
		int charArrayWordLength = stringWordLength;
		int tempArraylength = t.countVowels(xyz);
		char temp[]= new char[tempArraylength]; 
		int j=0;
		
		for(int i=0; i<charArrayWordLength; i++)
		{
			if(xyz[i]=='a' | xyz[i]=='e' | xyz[i]=='i' | xyz[i]=='o' | xyz[i]=='u' | 
			   xyz[i]=='A' | xyz[i]=='E' | xyz[i]=='I' | xyz[i]=='O' | xyz[i]=='U')
			   {
				   temp[j] = xyz[i];
				   for(int k=i; k<charArrayWordLength-1; k++)
				   {
					   xyz[k]=xyz[k+1];
				   }
				   charArrayWordLength=charArrayWordLength-1;
				   j++;
			   }
		}
		String vowelsRemovedInputString = new String(xyz);
		System.out.println(vowelsRemovedInputString);
		
		for(int l=0; l<tempArraylength-1; l++)
		{
			for(int m=l+1; m<tempArraylength; m++)
			{
				if(temp[l]==temp[m])
				{
					for(int n=m; n<tempArraylength-1; n++)
					{
						temp[n]=temp[n+1];
					}
					tempArraylength=tempArraylength-1;
				}
			}
		}
		String onlyVowelsString = new String(temp);
		System.out.println(onlyVowelsString);
		
		return (onlyVowelsString+vowelsRemovedInputString);
	}
}
