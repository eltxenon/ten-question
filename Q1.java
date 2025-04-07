import java.util.Scanner;

public class Q01
{

    public static String adadebozorg(String num1, String num2) 
    {
        StringBuilder result = new StringBuilder();

        int carry = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digit1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            result.append(sum % 10);
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("عدد اول (تا 15 رقم): ");
        String number1 = scanner.nextLine();

        System.out.print("عدد دوم (تا 15 رقم): ");
        String number2 = scanner.nextLine();

        String sum = addBigNumbers(number1, number2);
        System.out.println("جمع دو عدد: " + sum);
    }
}
