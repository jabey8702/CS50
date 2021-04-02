import java.util.Scanner;
//import java.lang.Math; 
class Credit{ 


public static void main (String args[])

{   //user input
	Scanner sc= new Scanner(System.in); 
	System.out.println("Number:");
	Long cardNumber;
	cardNumber=sc.nextLong();


	//check starting digits
	long exponent=10L;
	long amexPower=13L;
	long mcPower=14L;
	long visaPower1=12L;
	long visaPower2=15L;

	//checking checksum
	int AMEX=15;
	int MC=16;
	int V1=13;
	int V2=16;
	double oddDigits;
	double evenDigits;
	int sum1=0;
	int sum2=0;

	if(Math.floor(cardNumber/(Math.pow(exponent,amexPower)))==34
		||cardNumber/(Math.pow(exponent,amexPower))==37)
		{	
		for(int power=1;power<=AMEX;power+=2)
			{
				oddDigits=(Math.floor(cardNumber%(Math.pow(exponent,power))
				/Math.floor(Math.pow(exponent,power-1))));

				sum1+=(oddDigits);

			}
			
			for (int power=2;power<=AMEX;power+=2)
			{
				evenDigits=(Math.floor(cardNumber%(Math.pow(exponent,power))
				/Math.floor(Math.pow(exponent,power-1))));

	
				if ((evenDigits*2)>9)
				{
				sum2+=((evenDigits*2)%10)+((evenDigits*2/10));
				}
				else 
				{
					sum2+=(evenDigits*2);
				}
			
		}
			
		}
	if (Math.floor(cardNumber/(Math.pow(exponent,mcPower)))==51 
		||Math.floor(cardNumber/(Math.pow(exponent,mcPower)))==52 
		|| Math.floor(cardNumber/(Math.pow(exponent,mcPower)))==53
		|| Math.floor(cardNumber/(Math.pow(exponent,mcPower)))==54
		|| Math.floor(cardNumber/(Math.pow(exponent,mcPower)))==55)
		{	
			for(int power=1;power<=MC;power+=2)
			{
				oddDigits=(Math.floor(cardNumber%(Math.pow(exponent,power))
				/Math.floor(Math.pow(exponent,power-1))));

				sum1+=(oddDigits);

			}
			
			for (int power=2;power<=MC;power+=2)
			{
				evenDigits=(Math.floor(cardNumber%(Math.pow(exponent,power))
				/Math.floor(Math.pow(exponent,power-1))));

	
				if ((evenDigits*2)>9)
				{
					sum2+=((evenDigits*2)%10)+((evenDigits*2/10));
				}
				else 
				{
					sum2+=(evenDigits*2);
				}
			
		}
			
		}
	if (Math.floor(cardNumber/(Math.pow(exponent,visaPower1)))==4 )
		{	
			for(int power=1;power<=V1;power+=2)
			{
				oddDigits=(Math.floor(cardNumber%(Math.pow(exponent,power))
				/Math.floor(Math.pow(exponent,power-1))));

				sum1+=(oddDigits);

			}
			
			for (int power=2;power<=V1;power+=2)
			{
				evenDigits=(Math.floor(cardNumber%(Math.pow(exponent,power))
				/Math.floor(Math.pow(exponent,power-1))));

	
				if ((evenDigits*2)>9)
				{
					sum2+=((evenDigits*2)%10)+((evenDigits*2/10));
				}
				else 
				{
					sum2+=(evenDigits*2);
				}
			
		}
			
		}
	if(Math.floor(cardNumber/(Math.pow(exponent,visaPower2)))==4) 
		{	
			for(int power=1;power<=V2;power+=2)
			{
				oddDigits=(Math.floor(cardNumber%(Math.pow(exponent,power))
				/Math.floor(Math.pow(exponent,power-1))));

				sum1+=(oddDigits);

			}
			
			for (int power=2;power<=V2;power+=2)
			{
				evenDigits=(Math.floor(cardNumber%(Math.pow(exponent,power))
				/Math.floor(Math.pow(exponent,power-1))));

	
				if ((evenDigits*2)>9)
				{
					sum2+=((evenDigits*2)%10)+((evenDigits*2/10));
				}
				else 
				{
					sum2+=(evenDigits*2);
				}
			
		}
			
		}
	

	//checksum	
	int checksum=sum1+sum2;
	System.out.println("checksum:"+checksum);

	if(checksum%10==0)
	{

		if (Math.floor(cardNumber/(Math.pow(exponent,amexPower)))==34
		||Math.floor(cardNumber/(Math.pow(exponent,amexPower)))==37)
		{
			System.out.println("AMEX");
		}
		else if (Math.floor(cardNumber/(Math.pow(exponent,mcPower)))==51 
		||Math.floor(cardNumber/(Math.pow(exponent,mcPower)))==52 
		|| Math.floor(cardNumber/(Math.pow(exponent,mcPower)))==53
		|| Math.floor(cardNumber/(Math.pow(exponent,mcPower)))==54
		|| Math.floor(cardNumber/(Math.pow(exponent,mcPower)))==55)
		{
			System.out.println("Mastercard");
		}
		else if (Math.floor(cardNumber/(Math.pow(exponent,visaPower1)))==4 
		||Math.floor(cardNumber/(Math.pow(exponent,visaPower2)))==4) 
		{
			System.out.println("Visa");	
		}
		else 
		{
			System.out.println("INVALID");	
		}
	}

		


		/*System.out.println("Power:"+power);
		System.out.println("Expo:"+exponent);
		System.out.println("sum:"+sum);
		System.out.println("Math.pow:"+(int)(Math.pow(exponent,power)));
		System.out.println("cardno:"+cardNumber);
		System.out.println("formula:"+(cardNumber%(int)(Math.pow(exponent,power))));
		System.out.println(oddDigits);
		System.out.println(""+340360000000001L%1000);
		System.out.println("==============================");*/





		




	}





}