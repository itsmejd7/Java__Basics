import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter a number: ");
        int n = sc.nextInt(); 

        int i = 10; 

        while (i >= 1) {
            System.out.println(n + " x " + i + " = " + (n * i));
            i--; 
        }
        
        sc.close(); 
    }
}
