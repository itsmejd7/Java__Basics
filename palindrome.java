import java.util.Scanner;

public class palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String to check if it's a palindrome:");
        String original = sc.nextLine();

       
        boolean isPalin = original.equals(new StringBuilder(original).reverse().toString());

        if (isPalin) {
            System.out.println("\"" + original + "\" is a palindrome.");
        } else {
            System.out.println("\"" + original + "\" is not a palindrome.");
        }

       
        sc.close(); 
    }
}