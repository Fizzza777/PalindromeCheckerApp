public class PalindromeCheckerApp {
    public static void main(){
        String word = "madam";
        boolean isPalindrome = true;
        int n = word.length() -1;
        for (int i = 0; i < word.length()/2; i++){
             if(input.charAt(i) != input.charAt(input.length() -1 - i)) {
                 isPalindrome = false;
                 break;
             }
        }
        if(isPalindrome) {
            System.out.println(input + " Is a Palindrome. ");
        }
        else{
        System.out.println(input + " Is NOT a Palindrome. ");
        }
    }
}