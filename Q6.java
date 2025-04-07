import java.util.Scanner;

public class Q6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("tedad araye hay arry  ra vared konid ");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println(" araye ha ra vared konid");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("add aval ra vared konid ");
        int x = scanner.nextInt();

        System.out.print("add dovom ra vared konid");
        int y = scanner.nextInt();

        int minDist = Integer.MAX_VALUE;
        int lastPos = -1;
        int lastValue = -1;

        for (int i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (lastPos != -1 && arr[i] != lastValue) {
                    minDist = Math.min(minDist, i - lastPos);
                }
                lastPos = i;
                lastValue = arr[i];
            }
        }

        if (minDist == Integer.MAX_VALUE) {
            System.out.println(" fasel e vojod nadarad");
        } else {
            System.out.println(minDist);
        }
    }
}
