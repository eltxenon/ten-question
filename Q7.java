import java.util.Arrays;
import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // دریافت طول آرایه اول و عناصر
        System.out.print("تعداد عناصر آرایه اول: ");
        int n1 = scanner.nextInt();
        int[] arr1 = new int[n1];

        System.out.println("عناصر آرایه اول را وارد کنید:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = scanner.nextInt();
        }

        // دریافت طول آرایه دوم و عناصر
        System.out.print("تعداد عناصر آرایه دوم: ");
        int n2 = scanner.nextInt();
        int[] arr2 = new int[n2];

        System.out.println("عناصر آرایه دوم را وارد کنید:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        // بررسی تساوی (بدون توجه به ترتیب)
        if (areArraysEqualUnordered(arr1, arr2)) {
            System.out.println("✅ آرایه‌ها از نظر مقدار یکسان هستند.");
        } else {
            System.out.println("❌ آرایه‌ها با هم تفاوت دارند.");
        }
    }

    // تابع بررسی تساوی دو آرایه بدون در نظر گرفتن ترتیب
    public static boolean areArraysEqualUnordered(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }

        Arrays.sort(a);
        Arrays.sort(b);

        return Arrays.equals(a, b);
    }
}
