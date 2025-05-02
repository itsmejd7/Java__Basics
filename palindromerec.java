import java.util.Scanner;

public class palindromerec {


    public static boolean isPalindrome(String str, int start, int end) {

        if (start >= end) {
            return true;
        }
    
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A String To Check");
        String str = sc.nextLine();
        
        String lowerstr = str.toLowerCase();

        boolean result = isPalindrome(lowerstr, 0, lowerstr.length() - 1);
        
        if (result) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
