import java.util.Scanner;
import java.util.Stack;

public class Q03 {

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("reshte ha ra vared konid");
        String input = scanner.nextLine();

        if (isBalanced(input)) {
            System.out.println("tartib dorost ast");
        } else {
            System.out.println("tattib nadorost ast");
        }
    }
}

