import java.util.*;

public class Q10 {
    public static void main(String[] args) {
        int numCandidates = 5;
        int numVoters = 10;
        String[] candidates = {"A", "B", "C", "D", "E"};
        Map<String, Integer> scores = new HashMap<>();

        for (String candidate : candidates) {
            scores.put(candidate, 0);
        }

        Random random = new Random();
        System.out.println("برگه‌های رأی:");

        for (int i = 0; i < numVoters; i++) {
            List<String> ballot = new ArrayList<>(Arrays.asList(candidates));
            Collections.shuffle(ballot, random); // ترتیب تصادفی برای هر رأی‌دهنده

            System.out.println("رأی‌دهنده " + (i + 1) + ": " + ballot);

            for (int j = 0; j < ballot.size(); j++) {
                String candidate = ballot.get(j);
                int point = numCandidates - j - 1; // اولی 4 امتیاز، دومی 3، ...
                scores.put(candidate, scores.get(candidate) + point);
            }
        }

        System.out.println("\nامتیاز نهایی کاندیداها:");
        for (String candidate : candidates) {
            System.out.println("کاندید " + candidate + " : " + scores.get(candidate) + " امتیاز");
        }

        // پیدا کردن برنده
        String winner = Collections.max(scores.entrySet(), Map.Entry.comparingByValue()).getKey();
        System.out.println("\n✅ برنده انتخابات: کاندید " + winner);
    }
}
