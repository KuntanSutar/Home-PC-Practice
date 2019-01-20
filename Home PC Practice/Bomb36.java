// labled block : Used to improve Modularity & Readability
class Bomb36
{
	static public void main(String... Kuntan)
	{ 
		l1:
		{
			for(int i=0; i<3; i++)
			{
				System.out.println(i);
				l2:
				{
					for(int j=0; j<3; j++)
					{
						System.out.println(j);
						for(int k=0; k<3; k++)
						{
							System.out.println(k);
							if(k==2)
							{
								break l2;
							}
						}
					}
				}
			}
		}
	}
}