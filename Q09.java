import java.util.Random;

public class Q09 {
    public static void main(String[] args) {
        int numCandidates = 5;
        int numVoters = 25;
        int[] votes = new int[numCandidates]; // آرایه رای‌ها برای هر کاندید
        int blankVotes = 0;

        Random random = new Random();

        for (int i = 1; i <= numVoters; i++) {
            int vote = random.nextInt(numCandidates + 1); // عدد بین 0 تا 5 (0 = رای سفید)

            if (vote == 0) {
                blankVotes++;
                System.out.println("شرکت‌کننده " + i + " رای سفید داد.");
            } else {
                votes[vote - 1]++;
                System.out.println("شرکت‌کننده " + i + " به کاندید شماره " + vote + " رای داد.");
            }
        }

        System.out.println("\nنتیجه نهایی رای‌گیری:");
        for (int i = 0; i < numCandidates; i++) {
            System.out.println("کاندید شماره " + (i + 1) + " : " + votes[i] + " رای");
        }

        System.out.println("تعداد آراء سفید: " + blankVotes);
    }
}
