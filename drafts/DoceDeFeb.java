class DoceDeFeb{
	
	static String cipherKey= "TNSHKVEFXRBAUQZCLWDMIPGJO";
	static String word = "abc";
	static char answer;
	static int cipherPosition;
	static String realAnswer= "";

	
	static int getPosition(String letter)
	{
		
		letter = letter.toUpperCase();
		System.out.println(letter);

		abc 
		for(int j = 0; j < letter.length(); j++)
			{
				int ascii = (int)letter.charAt(j);
				System.out.println("Ascii: " + ascii); 

				int alphPosition = ascii - 65;
				System.out.println("Position: "+ alphPosition);

				cipherPosition = cipherKey.charAt(alphPosition);
				answer = (char)cipherPosition;
				realAnswer += Character.toString(answer);
				System.out.println("answer: "+answer);
				System.out.println("realAnswer: "+ realAnswer);

				System.out.println("======================");

			}
		return answer;
	}


	public static void main(String[] args) {

		getPosition(word);
	

	//Outcome: tns 

	
	
	/*String outcome; 

	//cipherKey.charAt(1)= N

	for (int i=0; i < plaintext.length(); i++)
	{
		outcome += getPosition(plaintext.charAt (i)) ;
		
		 
	}*/


	
}



}
