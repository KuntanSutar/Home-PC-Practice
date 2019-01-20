// If parent class constructor throws any checked exception; compulsory child class constructor should throw same checked exception or it's parent

import java.io.*; 
class P
{
	P() throws IOException
	{
	}
}
class C extends P 
{
	C() throws Throwable
	{
	}
}