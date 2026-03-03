public class Palindrome {
    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Reverse the string manually
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        // Display original and reversed
        System.out.println("Original Word: " + word);
        System.out.println("Reversed Word: " + reversed);

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println("Result: It is a palindrome.");
        } else {
            System.out.println("Result: It is NOT a palindrome.");
        }
    }
}