import java.util.Scanner;

class Readability {
	
	static int letters = 0;
	static int words = 1;
	static int sentences = 0;

	static int countLetters(String text){
		
		for (int j = 0; j < text.length(); j++)
		{
			if(text.charAt(j) >=65 && text.charAt(j) <=90 || text.charAt(j) >=97 && text.charAt(j) <=122)
			{
				// System.out.println(text.charAt(j));
				letters += 1;
				// System.out.println("Number of letters: "+letters);

			}
			
		}

		System.out.println("Total letters: "+letters);
		
		return letters;
	}

	static int countWords(String text){

		for (int i = 0; i < text.length(); i++)
		{
			if(text.charAt(i) == 32)
			{
				// System.out.println(text.charAt(j));
				words += 1;
				// System.out.println("Number of words: "+words);

			}
		}
		
		System.out.println("Total words: "+words); 

		return words;
	}

	static int countSentences(String text){


		for (int i = 0; i < text.length(); i++)
		{
			if(text.charAt(i) == 33 || text.charAt(i) == 46
				|| text.charAt(i) == 63 )
			{
				// System.out.println(text.charAt(j));
				sentences += 1;

			}

		}

		System.out.println("Total sentences: "+sentences);
		return sentences;
	}

	static int calculateIndex(int words, int letters, int sentences){
		double L = (double)letters / words * 100; 
		// System.out.println("L: "+L);

		double S = (double)sentences / words * 100;
		// double S = (double)2/3;
		// System.out.println("S: "+S);

		int colemanLiauIndex = (int) Math.round(0.0588 * L - 0.296 * S - 15.8);

		if (colemanLiauIndex < 1)
		{
			System.out.println("Before Grade 1");
		}
		else if(colemanLiauIndex >16)
		{
			System.out.println("Grade 16 +");
		}
		else
		{
			System.out.println("Grade: "+colemanLiauIndex);
		}
		

		return colemanLiauIndex;
	}
	




	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Text:");
		String text = scan.nextLine();
		countLetters(text);
		countWords(text);
		countSentences(text);
		calculateIndex(words, letters, sentences);

	
	}
}