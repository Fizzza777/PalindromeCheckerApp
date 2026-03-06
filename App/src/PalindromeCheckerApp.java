import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input: ");
        String input = sc.nextLine();

        long startTime = System.nanoTime();

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        long endTime = System.nanoTime();
        long executionTime = endTime - startTime;

        System.out.println("Is Palindrome: " + isPalindrome);
        System.out.println("Execution Time: " + executionTime + " ns");
    }
}