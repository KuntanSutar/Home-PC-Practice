class TooYoungException extends RuntimeException
{
	TooYoungException(String str)
	{
		super(str);
	}
}

class TooOldException extends RuntimeException
{
	TooOldException(String str)
	{
		super(str);
	}
}

class CustomizedException
{
	static public void main(String... Kuntan[0])
	{
		int age=Integer.parseInt(Kuntan[0]);
		
		if(age>60)
		{
			throw new TooYoungException("Please wait some more time!");
		}
		
		else if(age<18)
		{
			throw new TooOldException("Your age already crossed marriage age!");
		}
		
		else
		{
			System.out.println("You will get notification!");	
		}
	}
}