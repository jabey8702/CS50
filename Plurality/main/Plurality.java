import java.util.*;


class Plurality {
	static Candidate[] candidates = new Candidate[9];

	static int candidate_count;

	// Function prototypes
	static Boolean vote(String name) {
		for (int i = 0; i < candidate_count; i++) {
			if (name.equals(candidates[i].name)) {
				candidates[i].votes += 1;
				return true;
			}
		}

		return false;

	}

	static void print_winner_2() {
		int winnerIdx = 0;
		
		for (int i = 1; i < candidate_count; ++i) {
			if (candidates[i].votes > candidates[winnerIdx].votes) {
				winnerIdx = i;
			}
		}

		for (int i = 0; i < candidate_count; ++i) {
			if (candidates[i].votes == candidates[winnerIdx].votes) {
				System.out.println("Winner of this election is: " + candidates[i].name);
			}
		}
	}

	static void print_winner() {
		// Candidate currentWinner = candidates[0]; // one single winner with the highest score
		Candidate[] Winners = new Candidate[9]; // store winners with the same score
		int winIndex = 0;
		Winners[winIndex] = candidates[0];

		for (int i = 1; i < candidate_count; i++) {
			if(candidates[i].votes > Winners[winIndex].votes)
			{
				Arrays.fill(Winners, null);
				winIndex = 0;
				Winners[winIndex] = candidates[i];
			}
			else if(candidates[i].votes == Winners[winIndex].votes){
				++winIndex;
				Winners[winIndex] = candidates[i]; 
			}

		}
			
		for (int i = 0; i < Winners.length; i++)
		{
			if (Winners[i]!= null){
				System.out.println("Winner of this election is: " + Winners[i].name);
			}
		}
		
	}

		/*
		 * while (i < candidate_count && j < candidate_count) { if (candidates[i].votes
		 * > candidates[j].votes) { if (j < i) { j = i + 1;} else { j++; } } else if
		 * (candidates[i].votes < candidates[j].votes) { if (i < j) { i = j + 1; } else
		 * { i++; } }
		 * 
		 * }
		 */

	

	public static void main(String[] args) {

		int MAX = 9;

		if (args.length < 2) {
			System.out.println("There needs to be at least 2 candidates");
			return;
		}

		candidate_count = args.length;

		if (candidate_count > MAX) {
			System.out.println("Max number of candidates is 9");
			return;
		}
		for (int i = 0; i < candidate_count; i++) {
			candidates[i] = new Candidate();
			candidates[i].name = args[i];
			candidates[i].votes = 0;
		}

		Scanner sc = new Scanner(System.in);
		System.out.println("Number of voters:");
		int voters_count = sc.nextInt();
		sc.nextLine();

		// loop through all voters
		for (int i = 0; i < voters_count; i++) {
			System.out.println("Vote: ");
			String name = sc.nextLine();

			// Check for invalid vote
			if (!vote(name)) {
				System.out.println("Invalid vote");
			}
		}

		print_winner();
		sc.close();
	}
}

class Candidate {
	String name;
	int votes;
}
