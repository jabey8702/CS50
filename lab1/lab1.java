import java.util.*; //asterik is a 'wild card'-which means everything 

class lab1
{
	public static void main (String args[])
	{ 

		Scanner sc= new Scanner(System.in); 
		System.out.println("Start size:");
		int startSize;
		startSize=sc.nextInt(); 
	

	while (startSize<9)
	{
		
		sc= new Scanner(System.in); 
		System.out.println("Re-enter number greater than 9");
		System.out.println("Start size:");
		startSize=sc.nextInt(); 
		
	}

		sc= new Scanner(System.in); 
		System.out.println("End size:");
		int endSize;
		endSize=sc.nextInt();

	while (endSize<startSize)
	{
		sc= new Scanner(System.in); 
		System.out.println("Re-enter number greater than or equal to start size");
		System.out.println("End size:");
		endSize=sc.nextInt();

	} 

	int years=1;
	int currentPopulation=startSize;
	int born=currentPopulation/3;
	int died=currentPopulation/4;
	int numberOfLlamas=currentPopulation+born-died;	

	while (numberOfLlamas<endSize)
	{
		currentPopulation=numberOfLlamas;
		born=currentPopulation/3;
		died=currentPopulation/4;
		numberOfLlamas=currentPopulation+born-died;	

		years++;
		
	}

	System.out.println("Years:"+years);
	
	
	






	
	
   
   
    

		
 
	}
	


}
	

	
	 

	



