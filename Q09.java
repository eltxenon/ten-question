import java.util.Random;

public class Q09 {
    public static void main(String[] args) {
        int numCandidates = 5;
        int numVoters = 25;
        int[] votes = new int[numCandidates];
        int blankVotes = 0;

        Random random = new Random();

        for (int i = 1; i <= numVoters; i++) {
            int vote = random.nextInt(numCandidates + 1); 

            if (vote == 0) {
                blankVotes++;
                System.out.println("sherkat konandeh" + i + " raye sefid dad");
            } else {
                votes[vote - 1]++;
                System.out.println("sherkat konandeh " + i + " be" + vote + " raye  dad");
            }
        }

        System.out.println("\natijeh:");
        for (int i = 0; i < numCandidates; i++) {
            System.out.println("shomare" + (i + 1) + " : " + votes[i] + " raye");
        }

        System.out.println("tedad raye sefid" + blankVotes);
    }
}
