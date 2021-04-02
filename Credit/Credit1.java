import java.util.Scanner;
//import java.lang.Math; 
class Credit1{ 

public static long cardInput()
{	
	Scanner sc= new Scanner(System.in); 
	System.out.println("Number:");
	return sc.nextLong();
}

//Create a method to get the correct power and cardLength
public static int cardLength(long cardNumber)
{
	int count=0;

	while (cardNumber!=0)
	{
		cardNumber /=10;
		++count;
	}

	return count;

}


public static void cardType(int noOfDigits,long cardNumber)
{
	int exponent=10;
	int firstTwo = (int)Math.floor(cardNumber/(Math.pow(exponent,(noOfDigits-2))));
	int firstDigit=(int)Math.floor(cardNumber/(Math.pow(exponent,(noOfDigits-1))));

	
	if(noOfDigits==15)
	{
		if (firstTwo == 34 || firstTwo== 37)
		{
			System.out.println("AMEX");
		}
	}
		
	else if(noOfDigits==16)
	{
		if (firstTwo== 51 || firstTwo==52 || firstTwo==53 || firstTwo== 54 || 
			firstTwo== 55)
		{
			System.out.println("MasterCard");
		}
		if (firstDigit==4)
		{
			System.out.println("Visa");;
		}

	}
	else if(noOfDigits==13)
	{
		if (firstDigit==4)
		{
			System.out.println("Visa");
		}
	}
	else 
	{
		System.out.println("INVALID");
	}
}


public static void checkSum(long cardNumber,int noOfDigits)
{
	int exponent =10; 
	int checkSum=0;
	
	for(int power=1;power<=noOfDigits;power++)
	{
		long currentDigit=(long)(Math.floor(cardNumber%(Math.pow(exponent,power))));
		currentDigit = (long)(Math.floor(currentDigit/(Math.pow(exponent,power-1))));
		
		if (power%2==0) //if power is even
		{
			int timesTwo=(int)currentDigit*2;
			if (timesTwo>9)
			{
				int first=timesTwo%10;
				int second=(timesTwo%100)/10;
			
				
				checkSum+=first+second;
				
			}
			else 
			{
				checkSum+=timesTwo;
			}
		}
		else //if power is NOT even
			{
				checkSum+=currentDigit;
			}
	}
	
	if (checkSum%10==0)
	{
		cardType(noOfDigits,cardNumber);
	}
	else
	{
		System.out.println("Failed Checksum");
		System.out.println("INVALID");
	}	
	
 }


public static void main (String args[])
{   
	long cardNumber=cardInput();
	int noOfDigits=cardLength(cardNumber);
	checkSum(cardNumber,noOfDigits);

}
}