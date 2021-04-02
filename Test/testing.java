class testing{

	public static void main(String[] args) {

	// for (int last = 0; last < wordBefore.length(); last++)
	
		
		//Get every letter of the word starting from a 

		// abcdd
		// abcde
		// a
		// ""
		// abcb

		String word = "a";
		String wordBefore = "";

		if (word.length() <= 1 )
		{
			System.out.println("no repetition");
		}


			for (int i = 0, j = 1; j < word.length(); i++, j++)
			{
				wordBefore += word.charAt(i);
				System.out.println("wordBefore: "+ wordBefore);
			

				char currentWord = word.charAt(j);
				System.out.println("current word: "+ currentWord);
				
				for (int k = 0; k < wordBefore.length(); k++)
				{
					if (wordBefore.charAt(k) == currentWord)
					{
						System.out.println("Repeated word!");
						break;
					}
					else
					{
						System.out.println("NOT-REPEATED!");
					}
				}

			}


/*
		//WEIRD RESULTS WHY????

		// String word = "abcb";
		// String wordBefore = "";
		// for (int i = 1; i< word.length(); i++)
		// {
		// 	System.out.println(word.charAt(i));
		// 	char last = word.charAt(i);
			
		// 	for(j = 0; j< word.length; j++)
		// 	{
		// 		wordBefore += word.charAt(j);
		// 		System.out.println(wordBefore);
		// 		System.out.println("==========================");
			
		// 		if ( last== wordBefore.charAt(i))
		// 		{
		// 			System.out.println("Repeated!");
				
		// 		}
		// 	}

		// }

		//Get every letter 
		/*for (int k = 0; k < word.length(); k++)
		{
			wordBefore += word.charAt(k);
			System.out.println(wordBefore);
		}*/

		
	

	

	

	/*

	//How to update "word"

	for (int i = 0; i < word.length(); i++)
	{
		wordBefore += word.charAt(i);
		System.out.println(wordBefore);
	}


	// How to update "last"
	for (int i = 0; i< word.length(); i++)
	{
		System.out.println(word.charAt(i));


	}

	*/


	// How to compare "last" with "wordBefore" to check for duplicates
/*	
	char last = 'x';
	String wordBefore = "anjlfnladxsn";

	for (int j = 0; j < wordBefore.length(); j++)
	{
		System.out.print(wordBefore.charAt(j));
		if (last == wordBefore.charAt(j))
		{
			System.out.println("error");
		}
	}*/



}
}



/*



*/