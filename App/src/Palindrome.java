import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        String word = "madam";

        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            stack.push(ch);
            queue.add(ch);
        }

        boolean isPalindrome = true;

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.remove()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Word: " + word);

        if (isPalindrome)
            System.out.println("Result: It is a Palindrome.");
        else
            System.out.println("Result: It is NOT a Palindrome.");
    }
}