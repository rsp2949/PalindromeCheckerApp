public class Palindrome {
    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Check palindrome using string reverse logic
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Print result
        System.out.println("Word: " + word);
        if (word.equals(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
    }
}