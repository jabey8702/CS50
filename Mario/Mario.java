import java.util.*;
class Mario 
{
	public static void main (String args[])
	{
		Scanner sc= new Scanner(System.in); 
		System.out.println("Height:");
		int Height;
		Height=sc.nextInt();

	while(Height>8 || Height<1)
	{
		
		sc= new Scanner(System.in); 
		System.out.println("Number needs to be between 1 and 8");
		System.out.println("Height:");
		Height=sc.nextInt();

	
 
	}
	

	for (int line=1;line<=Height;line++)
	{	for(int noOfSpace=0;noOfSpace<(Height-line);noOfSpace++)
		{
			System.out.print(" ");

		}
		
		for(int noOfLHash=1;noOfLHash<=(Height-(Height-line));noOfLHash++) 
		{
			System.out.print("#");

		}

		for(int midSpace=0;midSpace<(Height);midSpace++)
		{
			System.out.print(" ");

		}

		for(int noOfRHash=1;noOfRHash<=(Height-(Height-line));noOfRHash++) 
		{
			System.out.print("#");
		}

		System.out.println("");
	}

	
	
		/*
		 
		System.out.print(" ");
		System.out.print(" ");
		System.out.println("#");
		System.out.print(" ");
		System.out.print("#");
		System.out.println("#");
		System.out.print("#");
		System.out.print("#");
		System.out.println("#");
		*/

		




	}


}