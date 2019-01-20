// Print some statements without static block & instance block & main method:
// This program will run fine in 1.6 Version
// But, in 1.7 V; if main method is not there in code; compulsory we will get RE 

class Fire35
{
	static Fire35 fire = new Fire35();
	Fire35()
	{
		System.out.println("Kuntan It's last chance. Show your potentials. Don't let it slip! Crack Sankey Solution's Interview");
		System.exit(0);
	}
}