import java.util.Scanner;

public class Palindrome {

    // Recursive palindrome method
    public static boolean check(String s, int start, int end) {

        // Base condition
        if (start >= end) {
            return true;
        }

        // Compare characters
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive call
        return check(s, start + 1, end - 1);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        boolean result = check(input, 0, input.length() - 1);

        if (result)
            System.out.println("Is Palindrome: true");
        else
            System.out.println("Is Palindrome: false");

        scanner.close();
    }
}