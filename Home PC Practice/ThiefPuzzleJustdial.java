/*
A thief trying to escape from a jail. He has to cross N (numberOfWalls) walls each with varying heights (every height is greater than 0). 
He climbs X feet (up) every time. But, due to the slippery nature of those walls, every time he slips back by Y feet (down). 
Now the task is to calculate the total number of jumps required to cross all walls and escape from the jail.
*/

import java.util.*;

class Test
{
	static public void main(String... Kuntan)
	{
	
		int up, down, resultant, numberOfWalls, totalJumpsRequired = 0;
		
		System.out.println("Enter Up, Down, Number of Walls:");
		
		Scanner sc = new Scanner(System.in);
		up = sc.nextInt();
		down = sc.nextInt();
		resultant = up-down;
		System.out.println(resultant);
		numberOfWalls = sc.nextInt();
		
		int[] heightsOfWalls = new int[numberOfWalls];
		
		for(int i=0; i<numberOfWalls; i++)
		{
			System.out.println("Enter Heigth:");
			heightsOfWalls[i] = sc.nextInt();
		}
		System.out.println();
		
		for(int j=0; j<numberOfWalls; j++)
		{
			int quotient = heightsOfWalls[j]/resultant;
			System.out.println(quotient);
			
			int remainder = heightsOfWalls[j]%resultant;
			System.out.println(remainder);
			
			if(remainder <= 1)
			{
				heightsOfWalls[j] = quotient;
			}
			else
			{
				heightsOfWalls[j] = quotient+1;
			}
		}
		System.out.println();
		
		for(int jump : heightsOfWalls)
		{
			System.out.println(jump);
		}
		System.out.println();
		
		for(int k=0; k<numberOfWalls; k++)
		{
			totalJumpsRequired += heightsOfWalls[k];
		}
		System.out.println("Total Jumps Required:"+totalJumpsRequired);
	}
}