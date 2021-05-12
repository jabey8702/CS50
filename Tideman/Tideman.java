import java.util.*;

class Tideman{


  // Max number of candidates
  
 static final int MAX = 9;

  // preferences[i][j] is number of voters who prefer i over j
  int [][] preferences = new int [MAX][MAX];

  // locked[i][j] means i is locked in over j
  Boolean[][] locked = new Boolean [MAX][MAX];

  // Each pair has a winner, loser


  // Array of candidates
  String[] candidates = new String [MAX];
  
  static Pair[] pairs = new pairs [MAX*(MAX-1)/2];

  static int pair_count;
  static int candidate_count;

  // Function prototypes
 Boolean vote(int rank, string name, int ranks[]){};

 static void recordPreferences(int ranks[]){

  }

static void addPairs(){}

static void sortPairs(){}

static void lockPairs(){};

static void printWinner(){};

public static void main(String[] args)
{
    // Check for invalid usage
    if (args.length < 2)
    {
        System.out.println("Usage: tideman [candidate ...]\n");
        return;
    }

    // Populate array of candidates
    candidate_count = args.length - 1;
    if (candidate_count > MAX)
    {
        printf("Maximum number of candidates is %i\n", MAX);
        return;
    }
    for (int i = 0; i < candidate_count; i++)
    {
        candidates[i] = argv[i + 1];
    }

    // Clear graph of locked in pairs
    for (int i = 0; i < candidate_count; i++)
    {
        for (int j = 0; j < candidate_count; j++)
        {
            locked[i][j] = false;
        }
    }

    pair_count = 0;
    int voter_count = get_int("Number of voters: ");

    // Query for votes
    for (int i = 0; i < voter_count; i++)
    {
        // ranks[i] is voter's ith preference
        int ranks[candidate_count];

        // Query for each rank
        for (int j = 0; j < candidate_count; j++)
        {
            string name = get_string("Rank %i: ", j + 1);

            if (!vote(j, name, ranks))
            {
                printf("Invalid vote.\n");
                return;
            }
        }

        recordPreferences(ranks);

        printf("\n");
    }

    addPairs();
    sortPairs();
    lockPairs();
    printWinner();
    return;
}

  // Update ranks given a new vote
  Boolean vote(int rank, string name, int ranks[]) {
    // TODO
    return false;
  }

  // Update preferences given one voter's ranks
void recordPreferences(int ranks[])
{
    // TODO
    return;
}

  // Record pairs of candidates where one is preferred over the other
void addPairs()
{
    // TODO
    return;
}

  // Sort pairs in decreasing order by strength of victory
void sortPairs()
{
    // TODO
    return;
}

  // Lock pairs into the candidate graph in order, without creating cycles
void lock_pairs(void)
{
    // TODO
    return;
}

  // Print the winner of the election
void print_winner(void)
{
    // TODO
    return;
}



}

class Pair
  {
    int winner;
    int loser;
  }
  

  
