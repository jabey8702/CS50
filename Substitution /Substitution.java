import java.util.Scanner;

class Substitution {

	static Boolean repeat(String repeticion) { // check for repetition within key
		repeticion = repeticion.toUpperCase();
		String wordBefore = "";
		for (int i = 0, j = 1; j < repeticion.length(); i++, j++) {
			wordBefore += repeticion.charAt(i);
			// System.out.println("wordBefore: " + wordBefore);
			if (repeticion.charAt(i) < 65 || repeticion.charAt(i) > 90) {
				System.out.println("Key can only contain alphabetical characters!");
				System.out.println(i);
				return false;
			}
			char currentWord = repeticion.charAt(j);
			// System.out.println("current word: " + currentWord);

			for (int k = 0; k < wordBefore.length(); k++) {
				if (wordBefore.charAt(k) == currentWord) {
					System.out.println("Repeated word!");
					return false;

				}

			}
		}
		return true;

	}

	static String encryptText(String cipherKey, String plainText) {

		String plainTextUpper = plainText.toUpperCase();
		// System.out.println(letter);

		String encryptedText = "";

		for (int j = 0; j < plainTextUpper.length(); j++) {

			int ascii = (int) plainTextUpper.charAt(j);

			if (plainTextUpper.charAt(j) < 65 || plainTextUpper.charAt(j) > 90) {
				encryptedText += plainTextUpper.charAt(j);
				continue;
			}

			int alphPosition = ascii - 65; // determines the position of the alphabet character

			int cipherCharacter = cipherKey.charAt(alphPosition);// substitutes plainTextUpper's character with
																														// cipherkey's character according to alph position
			String ciphCode = Character.toString(cipherCharacter).toUpperCase();

			if (plainText.charAt(j) >= 97 && plainText.charAt(j) <= 122) {
				ciphCode = ciphCode.toLowerCase();

			}

			encryptedText += ciphCode;

			// System.out.println("======================");

		}
		System.out.println("EncryptedText: " + encryptedText);
		return encryptedText;
	}

	public static void testRepeat() {// if a single test case fails return "FALSE"+those test case(s) else return //
		// "TRUE"

		passOrFail("VCHPRZGJNTLSKFBDQAXEUYMOO", false);
		passOrFail("VC1PRZGJNTLSKFBDQWAXEU1MOI", false);
		passOrFail("VCHPRZGJNTLSKFBDQWAXEUYMOi", false);
		passOrFail("VCHPRZGJNTLSKFBDQWAXEUYM  ", false);
		passOrFail("VCHPRZGJNTLSKF@D!WAXEUYM@I", false);
		passOrFail("XMFZagDOCRUYWPLTQvknbeihs1", false);
	}

	public static void passOrFail(String testCipherkey, Boolean assertedBool) {
		Boolean testCase = repeat(testCipherkey) == assertedBool;
		String result = "";
		if (testCase == true) {
			result = "pass";
		} else {
			result = "fail";
		}
		System.out.println("testcase:" + result);
	}

	public static void testEncrypt() { // if a single test case fails return "FALSE"+ that tests case(s) else return
																			// "TRUE"
		String cipherTest = "XMFZagDOCRUYWPLTQvknbeihsj";
		Boolean testEncryptUno = encryptText(cipherTest, "hello, world").equals("oayyl, ilvyz");
		if (testEncryptUno == true) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		Boolean testEncryptTwo = encryptText(cipherTest, "biden Trump").equals("mczap Nvbwt");
		if (testEncryptTwo == true) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

		Boolean testEncryptThree = encryptText(cipherTest, "1234").equals("1234");
		if (testEncryptThree == true) {
			System.out.println("pass");
		} else {
			System.out.println("fail");
		}

	}

	public static void testing() {
		System.out.println("testing repeat... Tests passed?");
		testRepeat();
		System.out.println("testing encrypt... Tests passed?");
		testEncrypt();

	}

	public static void main(String[] args) {

		System.out.println("Running tests....");
		testEncrypt();
		System.out.println("Done with tests....");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter encryption key:");
		String cipherKey = sc.nextLine();
		while (cipherKey.length() != 26) {
			System.out.println("Key must contain 26 characters");
			System.out.println("Enter encryption key:");
			cipherKey = sc.nextLine();
		}

		while (repeat(cipherKey) == false) {
			System.out.println("Enter encryption key:");
			cipherKey = sc.nextLine();
		}

		System.out.println("Enter plaintext:");

		String plainText = sc.nextLine();
		sc.close();

		encryptText(cipherKey, plainText);

	}

}

