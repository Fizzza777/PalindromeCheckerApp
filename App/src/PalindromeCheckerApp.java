public class PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("Welcome to the Palindrome Checker Management System");
        System.out.println("Version: 1.0");
        System.out.println("System initialized successfully");
        System.out.println();

        String word = "madam";

        // Method 1: Reverse string method
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome (Checked using Reverse Method).");
        } else {
            System.out.println(word + " is NOT a Palindrome (Checked using Reverse Method).");
        }

        System.out.println();

        // Method 2: Two-pointer comparison method
        boolean isPalindrome = true;

        for (int i = 0; i < word.length() / 2; i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(word + " is a Palindrome (Checked using Two-Pointer Method).");
        } else {
            System.out.println(word + " is NOT a Palindrome (Checked using Two-Pointer Method).");
        }
    }
}