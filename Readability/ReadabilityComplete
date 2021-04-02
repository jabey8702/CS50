import java.util.Scanner;

class Readability {

  static int countLetters(String text) {
    int letters = 0;

    for (int j = 0; j < text.length(); j++) {
      if (text.charAt(j) >= 65 && text.charAt(j) <= 90 || text.charAt(j) >= 97 && text.charAt(j) <= 122) {
        letters += 1;
      }

    }

    System.out.println("Total letters: " + letters);

    return letters;
  }

  public static void testCalculateIndex() {
    Boolean testCalculateIndexUno = calculateIndex(
        "Congratulations! Today is your day. You're off to Great Places? You're off and away!") == 3;

    if (testCalculateIndexUno == true) {
      System.out.println("Test 1 passed!");
    } else {
      System.out.println("Test 1 failed!");
    }

    Boolean testCalculateIndexTwo = calculateIndex(
        "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, \"and what is the use of a book,\" thought Alice \"without pictures or conversation?\"") == 8;

    if (testCalculateIndexTwo == true) {
      System.out.println("Test 2 passed!");
    } else {
      System.out.println("Test 2 failed!");
    }

    Boolean testCalculateIndexTres = calculateIndex(
        "It was a bright cold day in April, and the clocks were striking thirteen. Winston Smith, his chin nuzzled into his breast in an effort to escape the vile wind, slipped quickly through the glass doors of Victory Mansions, though not quickly enough to prevent a swirl of gritty dust from entering along with him.") == 10;

    if (testCalculateIndexTres == true) {
      System.out.println("Test 3 passed!");
    } else {
      System.out.println("Test 3 failed!");
    }

    Boolean testCalculateIndexFour = calculateIndex(
        "When he was nearly thirteen, my brother Jem got his arm badly broken at the elbow. When it healed, and Jem's fears of never being able to play football were assuaged, he was seldom self-conscious about his injury. His left arm was somewhat shorter than his right; when he stood or walked, the back of his hand was at right angles to his body, his thumb parallel to his thigh.") == 8;

    if (testCalculateIndexFour == true) {
      System.out.println("Test 4 passed!");
    } else {
      System.out.println("Test 4 failed!");
    }

    Boolean testCalculateIndexFive = calculateIndex(
        "A large class of computational problems involve the determination of properties of graphs, digraphs, integers, arrays of integers, finite families of finite sets, boolean formulas and elements of other countable domains.") >= 16;

    if (testCalculateIndexFive == true) {
      System.out.println("Test 5 passed!");
    } else {
      System.out.println("Test 5 failed!");
    }

    Boolean testCalculateIndexSix = calculateIndex("One fish. Two fish. Red fish. Blue fish.") <= 1;

    if (testCalculateIndexSix == true) {
      System.out.println("Test 6 passed!");
    } else {
      System.out.println("Test 6 failed!");
    }
  }

  static int countWords(String text) {
    int words = 1;

    for (int i = 0; i < text.length(); i++) {

      if (text.charAt(i) == 32) {
        words += 1;
      }

    }

    System.out.println("Total words: " + words);

    return words;
  }

  static int countSentences(String text) {
    int sentences = 0;

    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == 33 || text.charAt(i) == 46 || text.charAt(i) == 63) {
        sentences += 1;
      }

    }

    System.out.println("Total sentences: " + sentences);
    return sentences;
  }

  static int calculateIndex(String text) {
    int words = countWords(text);
    int letters = countLetters(text);
    int sentences = countSentences(text);
    double L = (double) letters / words * 100;

    double S = (double) sentences / words * 100;

    int colemanLiauIndex = (int) Math.round(0.0588 * L - 0.296 * S - 15.8);

    if (colemanLiauIndex < 1) {
      System.out.println("Before Grade 1");
    } else if (colemanLiauIndex > 16) {
      System.out.println("Grade 16 +");
    } else {
      System.out.println("Grade: " + colemanLiauIndex);
    }

    return colemanLiauIndex;
  }

  public static void main(String[] args) {

    /*
     * Testing program: System.out.println("Running Tests:"); testCalculateIndex();
     * System.out.println("Tests complete!");
     */

    Scanner scan = new Scanner(System.in);
    System.out.println("Text:");
    String text = scan.nextLine();
    scan.close();

    calculateIndex(text);

  }
}