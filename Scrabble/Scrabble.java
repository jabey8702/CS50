import java.util.Scanner;

class Scrabble {
  // compute score

  static int POINTS[] = { 1, 3, 3, 2, 1, 4, 2, 4, 1, 8, 5, 1, 3, 1, 1, 3, 10, 1, 1, 1, 1, 4, 4, 8, 4, 10 };

  static int compute_score(String text) {

    text = text.toUpperCase();
    int sum = 0;

    for (int i = 0; i < text.length(); i++) {

      int ascii = (int) text.charAt(i);

      if (ascii < 65 || ascii > 90) {

        continue;
      }

      int position = ascii - 65;

      sum = sum + POINTS[position];// ERROR
    }

    return sum;
  }

  public static void tests() {
    Boolean result1 = compute_score("ABC") == 7;
    System.out.println("ABC == 7? " + result1);

    Boolean result2 = compute_score("bca") == 7;
    System.out.println("bca == 7? " + result2);

    Boolean result3 = compute_score(" @#") == 0;
    System.out.println("trump " + result3);

  }

  public static void main(String[] args) {
    System.out.println("Running tests...");
    tests();
    System.out.println("Done with Test");
    // Get input words from both players
    Scanner scan = new Scanner(System.in);

    System.out.println("Player 1:");
    String word1 = scan.nextLine();

    System.out.println("Player 2:");
    String word2 = scan.nextLine();
    scan.close();

    // Score both words

    int score1 = compute_score(word1);
    int score2 = compute_score(word2);

    // TODO: Print the winner
    if (score1 > score2) {
      System.out.println("Player 1 wins!");
    } else if (score1 < score2) {
      System.out.println("Player 2 wins");
    } else {
      System.out.println("It's a tie!");
    }
  }

}