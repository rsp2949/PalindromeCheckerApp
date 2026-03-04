import java.util.LinkedList;

public class Palindrome {

    public static void main(String[] args) {

        String input = "level";

        // Create linked list
        LinkedList<Character> list = new LinkedList<>();

        // Convert string to linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        boolean isPalindrome = true;

        // Compare first and last until list shrinks
        while (list.size() > 1) {

            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}