import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("عدد مورد نظر را وارد کنید: ");
        String number = scanner.nextLine();

        if (number.length() % 2 != 0) {
            System.out.println("❌ تعداد رقم‌ها باید زوج باشد.");
            return;
        }

        int mid = number.length() / 2;
        int sumFirstHalf = 0;
        int sumSecondHalf = 0;

        for (int i = 0; i < mid; i++) {
            sumFirstHalf += Character.getNumericValue(number.charAt(i));
        }

        for (int i = mid; i < number.length(); i++) {
            sumSecondHalf += Character.getNumericValue(number.charAt(i));
        }

        if (sumFirstHalf == sumSecondHalf) {
            System.out.println("✅ مجموع نیمه اول و دوم برابر است.");
        } else {
            System.out.println("❌ مجموع نیمه اول و دوم برابر نیست.");
        }
    }
}
