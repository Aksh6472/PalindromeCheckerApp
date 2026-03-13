public class UseCase13PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "level";

        long start = System.nanoTime();

        boolean palindrome = check(input);

        long end = System.nanoTime();

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + palindrome);
        System.out.println("Execution Time : " + (end - start) + " ns");
    }

    static boolean check(String s){

        int start = 0;
        int end = s.length() - 1;

        while(start < end){

            if(s.charAt(start) != s.charAt(end))
                return false;

            start++;
            end--;
        }

        return true;
    }
}