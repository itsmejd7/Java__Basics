import java.util.*;

public class armstrong {
    public static boolean isArmstrong(int n) {
        int remainder, sum = 0, temp = n;
        while (n > 0) {
            remainder = n % 10;
            sum += remainder * remainder * remainder;
            n = n / 10;
        }
        return sum == temp;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = Integer.parseInt(scanner.nextLine());

        if (isArmstrong(number)) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }

        scanner.close();
    }
}
