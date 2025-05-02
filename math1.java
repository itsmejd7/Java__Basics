import java.util.Scanner;

class math1 {
    public int countDigit(long n) {
        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A Number:");
        Long n = sc.nextLong();

        math1 obj = new math1(); // Create object to call non-static method
        int result = obj.countDigit(n);
        System.out.println("Number of digits: " + result);
    }
}
