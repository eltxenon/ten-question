import java.util.Arrays;
import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("tedad anasor araye aval:");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("anasor araye aval:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        System.out.print("tedad anasor araye dovom:");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("عanasor araye dovom:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }
        if (areArraysEqualUnordered(arr1, arr2)) {
            System.out.println("barabar ast");
        } else {
            System.out.println("barabar nist ");
        }
    }
    public static boolean areArraysEqualUnordered(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
