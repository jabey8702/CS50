class DoceDeFeb{
	
public static void main(String[] args) {

	String cipherKey= "TNSHKVEFXRBAUQZCLWDMIPGJO";
 
	String plaintext= "abc"; 
	String letter = "nba"

	//Outcome: tns 

	int getPosition(String letter)
	{
		for(int j = 0; j < letter.length(); j++)
		{
			letter = letter.toUpperCase();
			int ascii = (int)letter; 
			int position = position - 65;
			System.out.println(positon);
			
		}
		return position;
	}
	
	/*String outcome; 

	//cipherKey.charAt(1)= N

	for (int i=0; i < plaintext.length(); i++)
	{
		outcome += getPosition(plaintext.charAt (i)) ;
		
		 
	}*/


	
}



}
