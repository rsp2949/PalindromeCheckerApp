public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Hardcoded string to check
        String word = "level";

        // Convert string to character array
        char[] characters = word.toCharArray();

        // Two-pointer approach
        int left = 0;
        int right = characters.length - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (characters[left] != characters[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is NOT a palindrome.");
        }
    }
}