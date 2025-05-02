import java.util.Scanner;

class reversenum {
    public boolean isPalindrome(int n) {
        int original = n;
        int reversed = 0;

        while (n > 0) {
            int lastdigit = n % 10;
            reversed = (reversed * 10) + lastdigit;
            n = n / 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();

        reversenum obj = new reversenum();
        boolean result = obj.isPalindrome(n);

        if (result) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }
}
