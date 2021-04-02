class TreceDeFeb{
	

	static String cipherKey= "TNSHKVEFXRBAUQZCLWDMIPGJO";
	static String word = "abcdefg";
	static int cipherPosition;
	static String answer= "";

	
	static String getCipherScore(String letter)
	{
		
		letter = letter.toUpperCase();
		System.out.println(letter);
		
		for(int j = 0; j < letter.length(); j++)
			{
				int ascii = (int)letter.charAt(j);
				System.out.println("Ascii: " + ascii); 

				int position = ascii - 65;
				System.out.println("Position: "+ position);

				cipherPosition = (char)cipherKey.charAt(position);
				answer += Character.toString(cipherPosition);
				System.out.println("Answer: "+answer);

				System.out.println("======================");

			}
		return answer;
	}


	public static void main(String[] args) {

		getCipherScore(word);
	}
}