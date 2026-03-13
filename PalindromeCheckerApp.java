public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";

        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean palindrome = true;

        for(int i = 0; i < normalized.length() / 2; i++){

            if(normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)){
                palindrome = false;
                break;
            }
        }

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + palindrome);
    }
}